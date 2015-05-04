package neforon.sunshine.earnmoney.facade.impl;

import neforon.sunshine.earnmoney.facade.EarnMoneyFacade;
import neforon.sunshine.earnmoney.service.EarnMoneyService;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sunshine on 4/11/15.
 */
public class EarnMoneyFacadeImpl implements EarnMoneyFacade {
    @Autowired
    private EarnMoneyService earnMoneyService;

    @Override
    public ResultData addEarnMethods(List<EarnItem> list) {
        ResultData result = new ResultData();
        result = earnMoneyService.addEarnMethods(list);
        return result;
    }

    @Override
    public ResultData queryEarnSlogan(String projectId) {
        ResultData result = new ResultData();
        result = earnMoneyService.queryEarnSlogan(projectId);
        return result;
    }

    @Override
    public ResultData addEarnSlogan(EarnSlogan slogan) {
        ResultData result = new ResultData();
        result = earnMoneyService.addEarnSlogan(slogan);
        return result;
    }
}
