package neforon.sunshine.manager.service.impl;

import neforon.sunshine.manager.dao.ManagerDao;
import neforon.sunshine.manager.service.ManagerService;
import neforon.sunshine.manager.vo.ManagerVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/16/15.
 */
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;

    @Override
    public ResultData queryManagerByAccount(String username, String password) {
        ResultData result = new ResultData();
        ManagerVo vo = managerDao.selectManagerByCredential(username, password);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
