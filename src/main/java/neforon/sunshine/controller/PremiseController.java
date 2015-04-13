package neforon.sunshine.controller;

import neforon.sunshine.earnmoney.facade.EarnMoneyFacade;
import neforon.sunshine.earnmoney.vo.EarnMoneyVo;
import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.guidance.vo.GuidanceVo;
import neforon.sunshine.project.facade.ProjectFacade;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.qrcode.facade.CodeFacade;
import neforon.sunshine.qrcode.vo.QRCodeVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import neforon.sunshine.utils.URLConst;
import neforon.sunshine.vo.PremiseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunshine on 4/8/15.
 */
@RestController
public class PremiseController {
    @Autowired
    private ProjectFacade projectFacade;

    @Autowired
    private CodeFacade codeFacade;

    @Autowired
    private GuidanceFacade guidanceFacade;

    @Autowired
    private EarnMoneyFacade earnMoneyFacade;

    @RequestMapping(method = RequestMethod.GET, value = URLConst.NEFORON_PREMISE)
    public ModelAndView queryPremise(HttpServletRequest request, HttpServletResponse response, @PathVariable String projectId) {
        ModelAndView view = new ModelAndView();
        PremiseVo premiseVo = new PremiseVo();
        ResultData projectMessage = projectFacade.queryProject(projectId);
        if (projectMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            ProjectVo project = projectMessage.getData();
            premiseVo.setProject(project);
        }

        ResultData qrCodeMessage = codeFacade.queryCode(projectId);
        if (qrCodeMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            QRCodeVo qrCode = qrCodeMessage.getData();
            premiseVo.setCode(qrCode);
        }

        ResultData guidanceMessage = guidanceFacade.queryGuidance(projectId);
        if (guidanceMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            GuidanceVo guidance = guidanceMessage.getData();
            String guidanceTitle = guidance.getTitle();
            premiseVo.setGuidance((GuidanceVo) guidanceMessage.getData());
        }

        ResultData earnMoneyMessage = earnMoneyFacade.queryEarnMoney(projectId);
        if (earnMoneyMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            EarnMoneyVo earnMoney = earnMoneyMessage.getData();
            String title = earnMoney.getEarnCompany();
            premiseVo.setEarnMoney(earnMoney);
        }

        view.setViewName("premise");
        view.addObject("premise", premiseVo);
        return view;
    }
}
