package neforon.sunshine.manager.facade;

import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/16/15.
 */
public interface ManagerFacade {
    public ResultData queryManager(String username, String password);
}
