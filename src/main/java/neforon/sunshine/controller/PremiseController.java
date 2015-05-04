package neforon.sunshine.controller;

import neforon.sunshine.averageprice.facade.AveragePriceFacade;
import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.buildingintro.facade.PremiseAdvantageFacade;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageVo;
import neforon.sunshine.coupon.facade.CouponFacade;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.earnmoney.facade.EarnMoneyFacade;
import neforon.sunshine.earnmoney.vo.EarnVo;
import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.guidance.vo.GuidanceVo;
import neforon.sunshine.housetype.facade.HouseTypeFacade;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.premiseview.facade.PremiseViewFacade;
import neforon.sunshine.premiseview.vo.PremiseViewVo;
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

    @RequestMapping(method = RequestMethod.GET, value = URLConst.NEFORON_PREMISE)
    public ModelAndView queryPremise(HttpServletRequest request, HttpServletResponse response, @PathVariable String projectId) {
        ModelAndView view = new ModelAndView();
        PremiseVo premiseVo = new PremiseVo();
        ResultData projectMessage = projectFacade.queryActiveProject(projectId);
        if (projectMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            ProjectVo project = projectMessage.getData();
            premiseVo.setProject(project);
        } else {
            view.setViewName("error");
            view.addObject("title", "操作失败");
            view.addObject("description", "你要访问的楼盘信息已失效");
            return view;
        }

        ResultData qrCodeMessage = codeFacade.queryCode(projectId);
        if (qrCodeMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            QRCodeVo qrCode = qrCodeMessage.getData();
            premiseVo.setCode(qrCode);
        }

        ResultData guidanceMessage = guidanceFacade.queryGuidance(projectId);
        if (guidanceMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            GuidanceVo guidance = guidanceMessage.getData();
            premiseVo.setGuidance((GuidanceVo) guidanceMessage.getData());
        }

        ResultData earnMessage = earnMoneyFacade.queryEarnSlogan(projectId);
        if (earnMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            EarnVo earn = earnMessage.getData();
            premiseVo.setEarnSlogan(earn);
        }

        ResultData averagePriceMessage = averagePriceFacade.queryAveragePrice(projectId);
        if (averagePriceMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            AveragePriceVo averagePrice = averagePriceMessage.getData();
            premiseVo.setAveragePrice(averagePrice);
        }

        ResultData premiseViewMessage = premiseViewFacade.queryPremiseView(projectId);
        if (premiseViewMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            PremiseViewVo premiseView = premiseViewMessage.getData();
            premiseVo.setPremiseView(premiseView);
        }

        ResultData couponMessage = couponFacade.queryCoupon(projectId);
        if (couponMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            CouponVo coupon = couponMessage.getData();
            premiseVo.setCoupon(coupon);
        }

        ResultData premiseAdvantageMessage = premiseAdvantageFacade.queryPremiseAdvantage(projectId);
        if (premiseAdvantageMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            PremiseAdvantageVo premiseAdvantage = premiseAdvantageMessage.getData();
            premiseVo.setPremiseAdvantages(premiseAdvantage);
        }

        ResultData houseTypeMessage = houseTypeFacade.queryHouseType(projectId);
        if (houseTypeMessage.getStatusCode() == ResponseCode.MESSAGE_OK) {
            HouseTypeVo houseType = houseTypeMessage.getData();
            premiseVo.setHouseType(houseType);
        }

        view.setViewName("premise");
        view.addObject("premise", premiseVo);
        return view;
    }
}
