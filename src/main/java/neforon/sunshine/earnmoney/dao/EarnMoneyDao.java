package neforon.sunshine.earnmoney.dao;

import neforon.sunshine.earnmoney.vo.EarnVo;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;

/**
 * Created by sunshine on 4/13/15.
 */
public interface EarnMoneyDao {

    public EarnVo selectEarnSlogan(String projectId);

    public boolean insertEarnMethodItem(EarnItem item);

    public boolean insertEarnSlogan(EarnSlogan slogan);
}
