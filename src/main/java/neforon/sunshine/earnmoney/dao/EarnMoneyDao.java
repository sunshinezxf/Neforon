package neforon.sunshine.earnmoney.dao;

import neforon.sunshine.earnmoney.vo.EarnMoneyItemVo;
import neforon.sunshine.model.EarnItem;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public interface EarnMoneyDao {
    public List<EarnMoneyItemVo> selectEarnMoneysItems(String projectId);

    public boolean insertEarnMethodItem(EarnItem item);
}
