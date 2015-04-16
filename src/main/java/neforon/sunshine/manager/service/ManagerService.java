package neforon.sunshine.manager.service;

import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/16/15.
 */
public interface ManagerService {
    public ResultData queryManagerByAccount(String username, String password);
}
