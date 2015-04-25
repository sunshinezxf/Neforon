package neforon.sunshine.buildingintro.service;

import neforon.sunshine.model.PremiseAdvantageItem;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public interface PremiseAdvantageService {
    public ResultData queryPremiseAdvantagesById(String projectId);

    public ResultData addPremiseAdvantage(List<PremiseAdvantageItem> list);
}
