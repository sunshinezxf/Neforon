package neforon.sunshine.housetype.service;

import neforon.sunshine.model.HouseType;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface HouseTypeService {
    public ResultData queryHouseTypeById(String projectId);

    public ResultData addHouseType(HouseType type);
}
