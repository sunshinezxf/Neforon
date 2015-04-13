package neforon.sunshine.qrcode.service.impl;

import neforon.sunshine.qrcode.dao.CodeDao;
import neforon.sunshine.qrcode.service.CodeService;
import neforon.sunshine.qrcode.vo.QRCodeVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/12/15.
 */
public class CodeServiceImpl implements CodeService {
    @Autowired
    private CodeDao codeDao;

    @Override
    public ResultData queryCodeById(String projectId) {
        ResultData result = new ResultData();
        QRCodeVo vo = codeDao.selectQRCodeById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
