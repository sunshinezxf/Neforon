package neforon.sunshine.premiseview.dao.impl;

import neforon.sunshine.premiseview.dao.PremiseViewDao;
import neforon.sunshine.premiseview.vo.PremiseViewVo;
import neforon.sunshine.utils.BaseDao;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseViewDaoImpl extends BaseDao implements PremiseViewDao {
    @Override
    public PremiseViewVo selectPremiseViewById(String projectId) {
        return sqlSession.selectOne("premiseview.selectPremiseView", projectId);
    }
}
