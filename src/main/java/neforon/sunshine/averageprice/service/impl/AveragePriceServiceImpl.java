package neforon.sunshine.averageprice.service.impl;

import neforon.sunshine.averageprice.dao.AveragePriceDao;
import neforon.sunshine.averageprice.service.AveragePriceService;
import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.model.AveragePrice;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class AveragePriceServiceImpl implements AveragePriceService {
    @Autowired
    private AveragePriceDao averagePriceDao;

    @Override
    public ResultData queryAveragePriceById(String projectId) {
        ResultData result = new ResultData();
        AveragePriceVo vo = averagePriceDao.selectAveragePriceById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }

    @Override
    public ResultData addAveragePrice(AveragePrice price) {
        ResultData result = new ResultData();
        boolean status = averagePriceDao.insertAveragePrice(price);
        if (status) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(status);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }
}
