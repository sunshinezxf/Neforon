package neforon.sunshine.premiseview.facade.impl;

import neforon.sunshine.premiseview.facade.PremiseViewFacade;
import neforon.sunshine.premiseview.service.PremiseViewService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseViewFacadeImpl implements PremiseViewFacade {
    @Autowired
    private PremiseViewService premiseViewService;

    @Override
    public ResultData queryPremiseView(String projectId) {
        ResultData result = new ResultData();
        result = premiseViewService.queryPremiseViewById(projectId);
        return result;
    }
}
