package neforon.sunshine.qrcode.service;

import neforon.sunshine.model.QRCode;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/12/15.
 */
public interface CodeService {
    public ResultData queryCodeById(String projectId);

    public ResultData addCode(QRCode code);
}
