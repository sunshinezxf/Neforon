package neforon.sunshine.averageprice.dao.impl;

import neforon.sunshine.averageprice.dao.AveragePriceDao;
import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.utils.BaseDao;

/**
 * Created by sunshine on 4/13/15.
 */
public class AveragePriceDaoImpl extends BaseDao implements AveragePriceDao {
    @Override
    public AveragePriceVo selectAveragePriceById(String projectId) {
        return sqlSession.selectOne("price.selectAvgPrice", projectId);
    }
}
