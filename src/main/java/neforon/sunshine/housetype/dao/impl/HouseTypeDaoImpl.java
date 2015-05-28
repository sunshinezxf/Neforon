package neforon.sunshine.housetype.dao.impl;

import neforon.sunshine.housetype.dao.HouseTypeDao;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.model.HouseType;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/13/15.
 */
public class HouseTypeDaoImpl extends BaseDao implements HouseTypeDao {

    @Override
    public HouseTypeVo selectHouseTypeById(String projectId) {
        try {
            return sqlSession.selectOne("housetype.selectHouseType", projectId);
        } catch (Exception e) {
            return sqlSession.selectOne("housetype.selectHouseType", projectId);
        }
    }

    @Override
    public boolean insertHouseType(HouseType type) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", type.getProjectId());
        params.put("housePicPath", type.getHousePicPath());
        params.put("address", type.getAddress());
        try {
            return (sqlSession.insert("housetype.insertHouseType", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("housetype.insertHouseType", params) != 0) ? true : false;
        }
    }
}
