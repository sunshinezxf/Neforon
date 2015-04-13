package neforon.sunshine.buildingintro.facade.impl;

import neforon.sunshine.buildingintro.facade.PremiseAdvantageFacade;
import neforon.sunshine.buildingintro.service.PremiseAdvantageService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseAdvantageFacadeImpl implements PremiseAdvantageFacade {
    @Autowired
    private PremiseAdvantageService premiseAdvantageService;

    @Override
    public ResultData queryPremiseAdvantage(String projectId) {
        ResultData result = new ResultData();
        result = premiseAdvantageService.queryPremiseAdvantagesById(projectId);
        return result;
    }
}
