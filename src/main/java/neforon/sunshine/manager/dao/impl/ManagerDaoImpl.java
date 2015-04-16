package neforon.sunshine.manager.dao.impl;

import neforon.sunshine.manager.dao.ManagerDao;
import neforon.sunshine.manager.vo.ManagerVo;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/16/15.
 */
public class ManagerDaoImpl extends BaseDao implements ManagerDao {

    @Override
    public ManagerVo selectManagerByCredential(String username, String password) {
        HashMap<String, String> condition = new HashMap<String, String>();
        condition.put("username", username);
        condition.put("password", password);
        return sqlSession.selectOne("manager.selectManager", condition);
    }
}
