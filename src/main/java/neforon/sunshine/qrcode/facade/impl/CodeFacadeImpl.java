package neforon.sunshine.qrcode.facade.impl;

import neforon.sunshine.qrcode.facade.CodeFacade;
import neforon.sunshine.qrcode.service.CodeService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/12/15.
 */
public class CodeFacadeImpl implements CodeFacade {
    @Autowired
    private CodeService codeService;

    @Override
    public ResultData queryCode(String projectId) {
        ResultData result = new ResultData();
        result = codeService.queryCodeById(projectId);
        return result;
    }
}
