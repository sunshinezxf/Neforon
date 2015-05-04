package neforon.sunshine.controller;

import neforon.sunshine.averageprice.facade.AveragePriceFacade;
import neforon.sunshine.buildingintro.facade.PremiseAdvantageFacade;
import neforon.sunshine.coupon.facade.CouponFacade;
import neforon.sunshine.earnmoney.facade.EarnMoneyFacade;
import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.housetype.facade.HouseTypeFacade;
import neforon.sunshine.manager.facade.ManagerFacade;
import neforon.sunshine.model.*;
import neforon.sunshine.premiseview.facade.PremiseViewFacade;
import neforon.sunshine.project.facade.ProjectFacade;
import neforon.sunshine.qrcode.facade.CodeFacade;
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

    @Autowired
    private CodeFacade codeFacade;

    @Autowired
    private GuidanceFacade guidanceFacade;

    @Autowired
    private EarnMoneyFacade earnMoneyFacade;

    @Autowired
    private AveragePriceFacade averagePriceFacade;

    @Autowired
    private PremiseViewFacade premiseViewFacade;

    @Autowired
    private CouponFacade couponFacade;

    @Autowired
    private PremiseAdvantageFacade premiseAdvantageFacade;

    @Autowired
    private HouseTypeFacade houseTypeFacade;

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

        ResultData historyMessage = projectFacade.queryHistoryProjects();
        if (historyMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
        } else {
            List<Project> historyList = historyMessage.getData();
            view.addObject("histories", historyList);
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
        ResultData insertProjectMessage = projectFacade.addProject(project);
        if (insertProjectMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

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
        ResultData insertQRStatus = codeFacade.addQRCode(qrCode);
        if (insertQRStatus.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

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
        ResultData insertGuidanceMessage = guidanceFacade.addGuidance(guidances);
        if (insertGuidanceMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

        /*获取赚钱的宣传标语*/
        MultipartFile earnSloganPic = ((MultipartRequest) request).getFile("earnSlogan");
        String sloganPath = FileUpload.saveEarnSloganPic(earnSloganPic, context);
        if (StringUtils.isEmpty(sloganPath)) {
            view.setViewName("error");
            return view;
        }
        EarnSlogan slogan = new EarnSlogan(projectId, sloganPath);
        ResultData insertEarnSloganMessage = earnMoneyFacade.addEarnSlogan(slogan);
        if (insertEarnSloganMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

        /*获取价钱*/
        String companyName = request.getParameter("companyName");
        Integer avgPrice = Integer.parseInt(request.getParameter("avgPrice"));
        String activityStatus = request.getParameter("activityStatus");
        if (StringUtils.isEmpty(companyName) || StringUtils.isEmpty(avgPrice) || StringUtils.isEmpty(activityStatus)) {
            view.setViewName("error");
            return view;
        }
        AveragePrice avg = new AveragePrice(projectId, companyName, avgPrice, activityStatus);
        ResultData insertAveragePriceMessage = averagePriceFacade.addAveragePrice(avg);
        if (insertAveragePriceMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }


        /*获取全景图*/
        MultipartFile premiseView = ((MultipartRequest) request).getFile("premisePic");
        String premisePath = FileUpload.savePremiseView(premiseView, context);
        if (StringUtils.isEmpty(premisePath)) {
            view.setViewName("error");
            return view;
        }
        PremiseView buildingView = new PremiseView(projectId, premisePath);
        ResultData insertBuildingViewMessage = premiseViewFacade.addPremiseView(buildingView);
        if (insertBuildingViewMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

        /*获取优惠设置*/
        String couponDetail = request.getParameter("couponDetail");
        if (StringUtils.isEmpty(couponDetail)) {
            view.setViewName("error");
            return view;
        }
        Coupon coupon = new Coupon(projectId, couponDetail);
        ResultData insertCouponMessage = couponFacade.addCoupon(coupon);
        if (insertCouponMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }


        /*楼盘介绍*/
        String advantage1 = request.getParameter("premiseAdvantage1");
        String advantage2 = request.getParameter("premiseAdvantage2");
        String advantage3 = request.getParameter("premiseAdvantage3");
        String advantage4 = request.getParameter("premiseAdvantage4");

        List<PremiseAdvantageItem> premiseAdvantages = new ArrayList<PremiseAdvantageItem>();
        premiseAdvantages.add(new PremiseAdvantageItem(projectId, advantage1, 1));
        premiseAdvantages.add(new PremiseAdvantageItem(projectId, advantage2, 2));
        premiseAdvantages.add(new PremiseAdvantageItem(projectId, advantage3, 3));
        premiseAdvantages.add(new PremiseAdvantageItem(projectId, advantage4, 4));

        ResultData insertPremiseAdvantageMessage = premiseAdvantageFacade.addPremiseAdvantage(premiseAdvantages);
        if (insertPremiseAdvantageMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }


        /*项目户型和地址*/
        MultipartFile houseTypeView = ((MultipartRequest) request).getFile("houseTypePic");
        String housePicPath = FileUpload.saveHouseTypeView(houseTypeView, context);
        String projectAddress = request.getParameter("projectAddress");
        HouseType houseType = new HouseType(projectId, housePicPath, projectAddress);

        ResultData insertHouseTypeMessage = houseTypeFacade.addHouseType(houseType);
        if (insertHouseTypeMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
            return view;
        }

        view.setViewName("result");
        String url = IPTeller.getIPv4Address(projectId);
        view.addObject("url", url);
        return view;
    }

    @RequestMapping(method = RequestMethod.POST, value = URLConst.NEFORON_DELETE)
    public ModelAndView deletePremise(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView();
        String projectId = request.getParameter("projectId");
        if (StringUtils.isEmpty(projectId)) {
            view.setViewName("error");
            return view;
        }
        projectFacade.drawProject(projectId);

        ResultData projectsMessage = projectFacade.queryActiveProjects();
        if (projectsMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
        } else {
            List<Project> projectList = projectsMessage.getData();
            view.addObject("projects", projectList);
        }

        ResultData historyMessage = projectFacade.queryHistoryProjects();
        if (historyMessage.getStatusCode() == ResponseCode.MESSAGE_NULL) {
            view.setViewName("error");
        } else {
            List<Project> historyList = historyMessage.getData();
            view.addObject("histories", historyList);
        }

        view.setViewName("manage");
        return view;
    }
}