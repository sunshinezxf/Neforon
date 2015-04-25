package neforon.sunshine.earnmoney.dao.impl;

import neforon.sunshine.earnmoney.dao.EarnMoneyDao;
import neforon.sunshine.earnmoney.vo.EarnMoneyItemVo;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class EarnMoneyDaoImpl extends BaseDao implements EarnMoneyDao {
    @Override
    public List<EarnMoneyItemVo> selectEarnMoneysItems(String projectId) {
        return sqlSession.selectList("earnmoney.selectEarnMoney", projectId);
    }

    @Override
    public boolean insertEarnMethodItem(EarnItem item) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", item.getProjectId());
        params.put("earnCompany", item.getEarnCompany());
        params.put("earnSlogan", item.getEarnSlogan());
        params.put("methodDesc", item.getMethodDesc());
        params.put("step", item.getStep());
        return (sqlSession.insert("earnmoney.insertEarnItem", params) != 0) ? true : false;
    }
}
