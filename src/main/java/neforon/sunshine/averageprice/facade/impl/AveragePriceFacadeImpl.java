package neforon.sunshine.averageprice.facade.impl;

import neforon.sunshine.averageprice.facade.AveragePriceFacade;
import neforon.sunshine.averageprice.service.AveragePriceService;
import neforon.sunshine.model.AveragePrice;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class AveragePriceFacadeImpl implements AveragePriceFacade {
    @Autowired
    private AveragePriceService averagePriceService;

    @Override
    public ResultData queryAveragePrice(String projectId) {
        ResultData result = new ResultData();
        result = averagePriceService.queryAveragePriceById(projectId);
        return result;
    }

    @Override
    public ResultData addAveragePrice(AveragePrice price) {
        ResultData result = new ResultData();
        result = averagePriceService.addAveragePrice(price);
        return result;
    }
}
