package neforon.sunshine.earnmoney.dao.impl;

import neforon.sunshine.earnmoney.dao.EarnMoneyDao;
import neforon.sunshine.earnmoney.vo.EarnVo;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/13/15.
 */
public class EarnMoneyDaoImpl extends BaseDao implements EarnMoneyDao {

    @Override
    public boolean insertEarnMethodItem(EarnItem item) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", item.getProjectId());
        params.put("earnCompany", item.getEarnCompany());
        params.put("earnSlogan", item.getEarnSlogan());
        params.put("methodDesc", item.getMethodDesc());
        params.put("step", item.getStep());
        try {
            return (sqlSession.insert("earnmoney.insertEarnItem", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("earnmoney.insertEarnItem", params) != 0) ? true : false;
        }
    }

    @Override
    public EarnVo selectEarnSlogan(String projectId) {
        try {
            return sqlSession.selectOne("earnmoney.selectEarnMoney", projectId);
        } catch (Exception e) {
            return sqlSession.selectOne("earnmoney.selectEarnMoney", projectId);
        }
    }

    @Override
    public boolean insertEarnSlogan(EarnSlogan slogan) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", slogan.getProjectId());
        params.put("earnSloganPic", slogan.getEarnSloganPic());
        try {
            return (sqlSession.insert("earnmoney.insertEarnSlogan", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("earnmoney.insertEarnSlogan", params) != 0) ? true : false;
        }
    }
}
