package neforon.sunshine.qrcode.dao.impl;

import neforon.sunshine.qrcode.dao.CodeDao;
import neforon.sunshine.qrcode.vo.QRCodeVo;
import neforon.sunshine.utils.BaseDao;

/**
 * Created by sunshine on 4/12/15.
 */
public class CodeDaoImpl extends BaseDao implements CodeDao {
    @Override
    public QRCodeVo selectQRCodeById(String projectId) {
        return sqlSession.selectOne("qrcode.selectProject", projectId);
    }
}
