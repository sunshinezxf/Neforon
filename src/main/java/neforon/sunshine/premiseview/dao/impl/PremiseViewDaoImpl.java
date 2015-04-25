package neforon.sunshine.premiseview.dao.impl;

import neforon.sunshine.model.PremiseView;
import neforon.sunshine.premiseview.dao.PremiseViewDao;
import neforon.sunshine.premiseview.vo.PremiseViewVo;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseViewDaoImpl extends BaseDao implements PremiseViewDao {
    @Override
    public PremiseViewVo selectPremiseViewById(String projectId) {
        return sqlSession.selectOne("premiseview.selectPremiseView", projectId);
    }

    @Override
    public boolean insertPremiseView(PremiseView view) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", view.getProjectId());
        params.put("premiseViewPath", view.getPremiseViewPath());
        return (sqlSession.insert("premiseview.insertPremise", params) != 0) ? true : false;
    }
}
