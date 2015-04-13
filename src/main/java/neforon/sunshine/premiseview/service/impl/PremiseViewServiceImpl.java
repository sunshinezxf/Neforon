package neforon.sunshine.premiseview.service.impl;

import neforon.sunshine.premiseview.dao.PremiseViewDao;
import neforon.sunshine.premiseview.service.PremiseViewService;
import neforon.sunshine.premiseview.vo.PremiseViewVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseViewServiceImpl implements PremiseViewService {
    @Autowired
    private PremiseViewDao premiseViewDao;

    @Override
    public ResultData queryPremiseViewById(String projectId) {
        ResultData result = new ResultData();
        PremiseViewVo vo = premiseViewDao.selectPremiseViewById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
