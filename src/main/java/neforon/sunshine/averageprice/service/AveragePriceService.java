package neforon.sunshine.averageprice.service;

import neforon.sunshine.model.AveragePrice;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface AveragePriceService {
    public ResultData queryAveragePriceById(String projectId);

    public ResultData addAveragePrice(AveragePrice price);
}
