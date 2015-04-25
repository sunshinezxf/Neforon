package neforon.sunshine.premiseview.dao;

import neforon.sunshine.model.PremiseView;
import neforon.sunshine.premiseview.vo.PremiseViewVo;

/**
 * Created by sunshine on 4/13/15.
 */
public interface PremiseViewDao {
    public PremiseViewVo selectPremiseViewById(String projectId);

    public boolean insertPremiseView(PremiseView view);
}
