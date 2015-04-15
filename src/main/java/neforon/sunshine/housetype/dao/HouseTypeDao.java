package neforon.sunshine.housetype.dao;

import neforon.sunshine.housetype.vo.HouseTypeVo;

/**
 * Created by sunshine on 4/13/15.
 */
public interface HouseTypeDao {
    public HouseTypeVo selectHouseTypeById(String projectId);
}
