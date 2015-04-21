package neforon.sunshine.manager.dao.impl;

import neforon.sunshine.manager.dao.ManagerDao;
import neforon.sunshine.manager.vo.ManagerVo;
import neforon.sunshine.utils.BaseDao;
import neforon.sunshine.utils.Encryption;

import java.util.HashMap;

/**
 * Created by sunshine on 4/16/15.
 */
public class ManagerDaoImpl extends BaseDao implements ManagerDao {

    @Override
    public ManagerVo selectManagerByCredential(String username, String password) {
        HashMap<String, String> condition = new HashMap<String, String>();
        condition.put("username", username);
        String encryptedPassword = Encryption.getEncryptedByMD5(password);
        condition.put("password", encryptedPassword);
        return sqlSession.selectOne("manager.selectManager", condition);
    }
}
