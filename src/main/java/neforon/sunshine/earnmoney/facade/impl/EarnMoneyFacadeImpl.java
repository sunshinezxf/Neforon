package neforon.sunshine.earnmoney.facade.impl;

import neforon.sunshine.earnmoney.facade.EarnMoneyFacade;
import neforon.sunshine.earnmoney.service.EarnMoneyService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/11/15.
 */
public class EarnMoneyFacadeImpl implements EarnMoneyFacade {
    @Autowired
    private EarnMoneyService earnMoneyService;

    @Override
    public ResultData queryEarnMoney(String projectId) {
        ResultData result = new ResultData();
        result = earnMoneyService.queryEarnMoneyById(projectId);
        return result;
    }
}
