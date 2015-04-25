package neforon.sunshine.premiseview.service;

import neforon.sunshine.model.PremiseView;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface PremiseViewService {
    public ResultData queryPremiseViewById(String projectId);

    public ResultData addPremiseView(PremiseView view);
}
