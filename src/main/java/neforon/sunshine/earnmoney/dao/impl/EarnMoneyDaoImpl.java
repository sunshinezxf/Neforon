package neforon.sunshine.earnmoney.dao.impl;

import neforon.sunshine.earnmoney.dao.EarnMoneyDao;
import neforon.sunshine.earnmoney.vo.EarnMoneyItemVo;
import neforon.sunshine.utils.BaseDao;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class EarnMoneyDaoImpl extends BaseDao implements EarnMoneyDao {
    @Override
    public List<EarnMoneyItemVo> selectEarnMoneysItems(String projectId) {
        return sqlSession.selectList("earnmoney.selectEarnMoney", projectId);
    }
}
