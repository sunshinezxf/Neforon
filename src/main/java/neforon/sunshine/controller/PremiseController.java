package neforon.sunshine.controller;

import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.utils.URLConst;
import neforon.sunshine.vo.PremiseVo;
import neforon.sunshine.vo.nullvo.NullPremiseVo;
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
    private GuidanceFacade guidanceFacade;

    public GuidanceFacade getGuidanceFacade() {
        return guidanceFacade;
    }

    public void setGuidanceFacade(GuidanceFacade guidanceFacade) {
        this.guidanceFacade = guidanceFacade;
    }

    @RequestMapping(method = RequestMethod.GET, value = URLConst.NEFORON_PREMISE)
    public ModelAndView queryPremise(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView();
//        ResultData guidanceMessage = guidanceFacade.queryGuidance();

        PremiseVo premiseVo = new NullPremiseVo();

        view.setViewName("premise");
        view.addObject("premise", premiseVo);
        return view;
    }
}
