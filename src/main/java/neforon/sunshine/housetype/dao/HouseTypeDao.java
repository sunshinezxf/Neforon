package neforon.sunshine.housetype.dao;

import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.model.HouseType;

/**
 * Created by sunshine on 4/13/15.
 */
public interface HouseTypeDao {
    public HouseTypeVo selectHouseTypeById(String projectId);

    public boolean insertHouseType(HouseType type);
}
