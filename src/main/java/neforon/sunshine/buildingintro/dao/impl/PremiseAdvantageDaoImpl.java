package neforon.sunshine.buildingintro.dao.impl;

import neforon.sunshine.buildingintro.dao.PremiseAdvantageDao;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageItemVo;
import neforon.sunshine.model.PremiseAdvantageItem;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseAdvantageDaoImpl extends BaseDao implements PremiseAdvantageDao {
    @Override
    public List<PremiseAdvantageItemVo> selectPremiseAdvantageById(String projectId) {
        try {
            return sqlSession.selectList("premiseadvantage.selectPremiseAdvantage", projectId);
        }catch (Exception e) {
            return sqlSession.selectList("premiseadvantage.selectPremiseAdvantage", projectId);
        }
    }

    @Override
    public boolean insertPremiseAdvantageItem(PremiseAdvantageItem item) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", item.getProjectId());
        params.put("advantage", item.getAdvantage());
        params.put("step", item.getStep());
        try {
            return (sqlSession.insert("premiseadvantage.insertPremiseAdvantageItem", params) != 0) ? true : false;
        }catch (Exception e) {
            return (sqlSession.insert("premiseadvantage.insertPremiseAdvantageItem", params) != 0) ? true : false;
        }
    }
}
