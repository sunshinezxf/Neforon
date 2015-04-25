package neforon.sunshine.earnmoney.service;

import neforon.sunshine.model.EarnItem;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public interface EarnMoneyService {
    public ResultData queryEarnMoneyById(String projectId);

    public ResultData addEarnMethods(List<EarnItem> list);
}
