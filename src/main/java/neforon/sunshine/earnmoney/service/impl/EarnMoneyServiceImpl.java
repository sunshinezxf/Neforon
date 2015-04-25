package neforon.sunshine.earnmoney.service.impl;

import neforon.sunshine.earnmoney.dao.EarnMoneyDao;
import neforon.sunshine.earnmoney.service.EarnMoneyService;
import neforon.sunshine.earnmoney.vo.EarnMoneyItemVo;
import neforon.sunshine.earnmoney.vo.EarnMoneyVo;
import neforon.sunshine.model.EarnItem;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class EarnMoneyServiceImpl implements EarnMoneyService {
    @Autowired
    private EarnMoneyDao earnMoneyDao;

    @Override
    public ResultData queryEarnMoneyById(String projectId) {
        ResultData result = new ResultData();
        List<EarnMoneyItemVo> list = earnMoneyDao.selectEarnMoneysItems(projectId);
        if (!StringUtils.isEmpty(list)) {
            EarnMoneyVo vo = new EarnMoneyVo(list);
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }

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
}
