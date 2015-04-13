package neforon.sunshine.buildingintro.dao.impl;

import neforon.sunshine.buildingintro.dao.PremiseAdvantageDao;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageItemVo;
import neforon.sunshine.utils.BaseDao;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseAdvantageDaoImpl extends BaseDao implements PremiseAdvantageDao {
    @Override
    public List<PremiseAdvantageItemVo> selectPremiseAdvantageById(String projectId) {
        return sqlSession.selectList("premiseadvantage.selectPremiseAdvantage", projectId);
    }
}
