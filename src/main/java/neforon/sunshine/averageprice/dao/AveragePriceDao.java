package neforon.sunshine.averageprice.dao;

import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.model.AveragePrice;

/**
 * Created by sunshine on 4/13/15.
 */
public interface AveragePriceDao {
    public AveragePriceVo selectAveragePriceById(String projectId);

    public boolean insertAveragePrice(AveragePrice price);
}
