package neforon.sunshine.qrcode.facade;

import neforon.sunshine.model.QRCode;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/12/15.
 */
public interface CodeFacade {
    public ResultData queryCode(String projectId);

    public ResultData addQRCode(QRCode code);
}
