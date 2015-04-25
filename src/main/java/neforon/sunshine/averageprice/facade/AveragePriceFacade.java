package neforon.sunshine.averageprice.facade;

import neforon.sunshine.model.AveragePrice;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface AveragePriceFacade {
    public ResultData queryAveragePrice(String projectId);

    public ResultData addAveragePrice(AveragePrice price);
}
