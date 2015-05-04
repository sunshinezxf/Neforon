package neforon.sunshine.earnmoney.service.impl;

import neforon.sunshine.earnmoney.dao.EarnMoneyDao;
import neforon.sunshine.earnmoney.service.EarnMoneyService;
import neforon.sunshine.earnmoney.vo.EarnVo;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.model.EarnSlogan;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class EarnMoneyServiceImpl implements EarnMoneyService {
    @Autowired
    private EarnMoneyDao earnMoneyDao;

    @Override
    public ResultData addEarnMethods(List<EarnItem> list) {
        ResultData result = new ResultData();
        for (EarnItem item : list) {
            boolean status = earnMoneyDao.insertEarnMethodItem(item);
            if (!status) {
                result.setStatusCode(ResponseCode.MESSAGE_NULL);
                return result;
            }
        }
        result.setStatusCode(ResponseCode.MESSAGE_OK);
        return result;
    }

    @Override
    public ResultData queryEarnSlogan(String projectId) {
        ResultData result = new ResultData();
        EarnVo vo = earnMoneyDao.selectEarnSlogan(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }

    @Override
    public ResultData addEarnSlogan(EarnSlogan slogan) {
        ResultData result = new ResultData();
        boolean status = earnMoneyDao.insertEarnSlogan(slogan);
        if (!status) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
            return result;
        }
        result.setStatusCode(ResponseCode.MESSAGE_OK);
        return result;
    }
}
