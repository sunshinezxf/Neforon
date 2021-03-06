package neforon.sunshine.premiseview.facade;

import neforon.sunshine.model.PremiseView;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface PremiseViewFacade {
    public ResultData queryPremiseView(String projectId);

    public ResultData addPremiseView(PremiseView view);
}
