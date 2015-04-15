package neforon.sunshine.housetype.facade.impl;

import neforon.sunshine.housetype.facade.HouseTypeFacade;
import neforon.sunshine.housetype.service.HouseTypeService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class HouseTypeFacadeImpl implements HouseTypeFacade {
    @Autowired
    private HouseTypeService houseTypeService;

    @Override
    public ResultData queryHouseType(String projectId) {
        ResultData result = new ResultData();
        result = houseTypeService.queryHouseTypeById(projectId);
        return result;
    }
}
