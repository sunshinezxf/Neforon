package neforon.sunshine.housetype.facade;

import neforon.sunshine.model.HouseType;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface HouseTypeFacade {
    public ResultData queryHouseType(String projectId);

    public ResultData addHouseType(HouseType type);
}
