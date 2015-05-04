package neforon.sunshine.earnmoney.service;

import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public interface EarnMoneyService {

    public ResultData addEarnMethods(List<EarnItem> list);

    public ResultData queryEarnSlogan(String projectId);

    public ResultData addEarnSlogan(EarnSlogan slogan);
}
