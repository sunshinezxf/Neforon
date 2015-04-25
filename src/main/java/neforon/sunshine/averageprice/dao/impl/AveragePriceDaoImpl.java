package neforon.sunshine.averageprice.dao.impl;

import neforon.sunshine.averageprice.dao.AveragePriceDao;
import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.model.AveragePrice;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/13/15.
 */
public class AveragePriceDaoImpl extends BaseDao implements AveragePriceDao {

    @Override
    public AveragePriceVo selectAveragePriceById(String projectId) {
        return sqlSession.selectOne("price.selectAvgPrice", projectId);
    }

    @Override
    public boolean insertAveragePrice(AveragePrice price) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", price.getProjectId());
        params.put("companyName", price.getCompanyName());
        params.put("avgPrice", price.getAvgPrice());
        params.put("activityState", price.getActivityState());
        return (sqlSession.insert("price.insertAvgPrice", params) != 0) ? true : false;
    }
}
