package neforon.sunshine.qrcode.dao;

import neforon.sunshine.model.QRCode;
import neforon.sunshine.qrcode.vo.QRCodeVo;

/**
 * Created by sunshine on 4/12/15.
 */
public interface CodeDao {
    public QRCodeVo selectQRCodeById(String projectId);

    public boolean insertQRCode(String projectId, String qrPath);
}
