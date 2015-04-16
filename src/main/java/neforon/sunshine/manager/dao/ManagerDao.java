package neforon.sunshine.manager.dao;

import neforon.sunshine.manager.vo.ManagerVo;

/**
 * Created by sunshine on 4/16/15.
 */
public interface ManagerDao {
    public ManagerVo selectManagerByCredential(String username, String password);
}
