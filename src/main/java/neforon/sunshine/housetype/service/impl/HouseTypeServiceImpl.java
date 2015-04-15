package neforon.sunshine.housetype.service.impl;

import neforon.sunshine.housetype.dao.HouseTypeDao;
import neforon.sunshine.housetype.service.HouseTypeService;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class HouseTypeServiceImpl implements HouseTypeService {
    @Autowired
    private HouseTypeDao houseTypeDao;

    @Override
    public ResultData queryHouseTypeById(String projectId) {
        ResultData result = new ResultData();
        HouseTypeVo vo = houseTypeDao.selectHouseTypeById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
