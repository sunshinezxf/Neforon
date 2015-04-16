package neforon.sunshine.manager.facade.impl;

import neforon.sunshine.manager.facade.ManagerFacade;
import neforon.sunshine.manager.service.ManagerService;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/16/15.
 */
public class ManagerFacadeImpl implements ManagerFacade {
    private ManagerService managerService;

    @Override
    public ResultData queryManager(String username, String password) {
        ResultData result = new ResultData();
        result = managerService.queryManagerByAccount(username, password);
        return result;
    }
}
