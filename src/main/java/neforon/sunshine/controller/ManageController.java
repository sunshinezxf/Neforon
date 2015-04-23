package neforon.sunshine.controller;

import neforon.sunshine.manager.facade.ManagerFacade;
import neforon.sunshine.model.*;
import neforon.sunshine.project.facade.ProjectFacade;
import neforon.sunshine.utils.*;
import neforon.sunshine.vo.PremiseVo;
import neforon.sunshine.vo.nullvo.NullPremiseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/16/15.
 */
@RestController
public class ManageController {
    @Autowired
    private ManagerFacade managerFacade;

    @Autowired
    private ProjectFacade projectFacade;

    @RequestMapping(method = RequestMethod.POST, value = URLConst.NEFORON_AUTHENTICATION)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            view.setViewName("error");
            return view;
        }

        ResultData authenticationMessage = managerFacade.queryManager(username, password);
        if (authenticationMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

        ResultData projectsMessage = projectFacade.queryActiveProjects();
        if (projectsMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
        } else {
            List<Project> projectList = projectsMessage.getData();
            view.addObject("projects", projectList);
        }
        view.setViewName("manage");
        return view;
    }


    @RequestMapping(method = RequestMethod.POST, value = URLConst.NEFORON_CREATE)
    public ModelAndView generatePremiseTemplate(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView();
        String projectName = request.getParameter("projectName");
        if (StringUtils.isEmpty(projectName)) {
            view.setViewName("manage");
            return view;
        }
        PremiseVo template = new NullPremiseVo();
        view.addObject("template", template);
        view.addObject("projectName", projectName);
        view.setViewName("template");
        return view;
    }

    @RequestMapping(method = RequestMethod.POST, value = URLConst.NEFORON_SUBMIT)
    public ModelAndView createPremise(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView();
        String projectName = DataHandle.handleData(request.getParameter("projectName"));
        if (StringUtils.isEmpty(projectName)) {
            view.setViewName("error");
            return view;
        }

        /*生成项目的projectId*/
        String projectId = IDGenerator.generateProjectID();
        if (StringUtils.isEmpty(projectId)) {
            view.setViewName("error");
            return view;
        }

        Project project = new Project(projectId, projectName);

        /*获取项目的上下文路径*/
        String context = request.getSession().getServletContext().getRealPath("/");

        /*生成保存在服务起的二维码的路径*/
        MultipartFile qrCodePic = ((MultipartRequest) request).getFile("qrPic");
        String qrPath = FileUpload.saveQRCodePic(qrCodePic, context);
        if (StringUtils.isEmpty(qrPath)) {
            view.setViewName("error");
            return view;
        }
        QRCode qrCode = new QRCode(projectId, qrPath);

        /*获取扫码标题*/
        String guidanceTitle = DataHandle.handleData(request.getParameter("guidanceTitle"));
        if (StringUtils.isEmpty(guidanceTitle)) {
            view.setViewName("error");
            return view;
        }

        /*获取扫码步骤*/
        String guidanceStep1 = DataHandle.handleData(request.getParameter("guidanceStep1"));
        String guidanceStep2 = DataHandle.handleData(request.getParameter("guidanceStep2"));
        String guidanceStep3 = DataHandle.handleData(request.getParameter("guidanceStep3"));
        String guidanceStep4 = DataHandle.handleData(request.getParameter("guidanceStep4"));

        List<GuidanceItem> guidances = new ArrayList<GuidanceItem>();
        guidances.add(new GuidanceItem(projectId, guidanceTitle, guidanceStep1, 1));
        guidances.add(new GuidanceItem(projectId, guidanceTitle, guidanceStep2, 2));
        guidances.add(new GuidanceItem(projectId, guidanceTitle, guidanceStep3, 3));
        guidances.add(new GuidanceItem(projectId, guidanceTitle, guidanceStep4, 4));


        /*获取赚钱方法*/
        String earnCompany = request.getParameter("earnCompany");
        String earnSlogan = request.getParameter("earnSlogan");
        String earnMethod1 = request.getParameter("earnMethod1");
        String earnMethod2 = request.getParameter("earnMethod2");
        String earnMethod3 = request.getParameter("earnMethod3");
        String earnMethod4 = request.getParameter("earnMethod4");

        List<EarnItem> earns = new ArrayList<EarnItem>();
        earns.add(new EarnItem(projectId, earnCompany, earnSlogan, earnMethod1, 1));
        earns.add(new EarnItem(projectId, earnCompany, earnSlogan, earnMethod2, 2));
        earns.add(new EarnItem(projectId, earnCompany, earnSlogan, earnMethod3, 3));
        earns.add(new EarnItem(projectId, earnCompany, earnSlogan, earnMethod4, 4));

        /*获取价钱*/
        String companyName = request.getParameter("companyName");
        Integer avgPrice = Integer.parseInt(request.getParameter("avgPrice"));
        String activityStatus = request.getParameter("activityStatus");
        if (StringUtils.isEmpty(companyName) || StringUtils.isEmpty(avgPrice) || StringUtils.isEmpty(activityStatus)) {
            view.setViewName("error");
            return view;
        }
        AveragePrice avg = new AveragePrice(projectId, companyName, avgPrice, avtivityStatus);

        /*获取全景图*/
        MultipartFile premiseView = ((MultipartRequest) request).getFile("premisePic");
        String premisePath = FileUpload.savePremiseView(premiseView, context);
        if (StringUtils.isEmpty(premisePath)) {
            view.setViewName("error");
            return view;
        }
        PremiseView buildingView = new PremiseView(projectId, premisePath);

        /*获取优惠设置*/
        String couponTitle = request.getParameter("couponTitle");
        String couponDetail = request.getParameter("couponDetail");
        if (StringUtils.isEmpty(couponTitle) || StringUtils.isEmpty(couponDetail)) {
            view.setViewName("error");
            return view;
        }
        Coupon coupon = new Coupon(projectId, couponTitle, couponDetail);

        /*楼盘介绍*/

        view.setViewName("result");
        return view;
    }
}