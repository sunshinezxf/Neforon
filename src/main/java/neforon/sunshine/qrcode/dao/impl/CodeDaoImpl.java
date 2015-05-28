package neforon.sunshine.qrcode.dao.impl;

import neforon.sunshine.qrcode.dao.CodeDao;
import neforon.sunshine.qrcode.vo.QRCodeVo;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/12/15.
 */
public class CodeDaoImpl extends BaseDao implements CodeDao {
    @Override
    public QRCodeVo selectQRCodeById(String projectId) {
        try {
            return sqlSession.selectOne("qrcode.selectProject", projectId);
        } catch (Exception e) {
            return sqlSession.selectOne("qrcode.selectProject", projectId);
        }
    }

    @Override
    public boolean insertQRCode(String projectId, String qrPath) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("projectId", projectId);
        params.put("qrPath", qrPath);
        try {
            return (sqlSession.insert("qrcode.insertProject", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("qrcode.insertProject", params) != 0) ? true : false;
        }
    }
}
