package neforon.sunshine.earnmoney.facade;

import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/11/15.
 */
public interface EarnMoneyFacade {

    public ResultData addEarnMethods(List<EarnItem> list);

    public ResultData queryEarnSlogan(String projectId);

    public ResultData addEarnSlogan(EarnSlogan slogan);
}
