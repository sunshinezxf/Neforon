package neforon.sunshine.premiseview.service.impl;

import neforon.sunshine.model.PremiseView;
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

    @Override
    public ResultData addPremiseView(PremiseView view) {
        ResultData result = new ResultData();
        boolean status = premiseViewDao.insertPremiseView(view);
        if (status) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(status);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }
}
