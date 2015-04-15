package neforon.sunshine.housetype.dao.impl;

import neforon.sunshine.housetype.dao.HouseTypeDao;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.utils.BaseDao;

/**
 * Created by sunshine on 4/13/15.
 */
public class HouseTypeDaoImpl extends BaseDao implements HouseTypeDao {

    @Override
    public HouseTypeVo selectHouseTypeById(String projectId) {
        return sqlSession.selectOne("housetype.selectHouseType", projectId);
    }
}
