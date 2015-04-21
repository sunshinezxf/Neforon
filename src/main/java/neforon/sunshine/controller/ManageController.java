package neforon.sunshine.controller;

import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.manager.facade.ManagerFacade;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import neforon.sunshine.utils.URLConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunshine on 4/16/15.
 */
@RestController
public class ManageController {
    @Autowired
    private ManagerFacade managerFacade;

    @Autowired
    private GuidanceFacade guidanceFacade;

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
        view.setViewName("manage");

        return view;
    }
}
