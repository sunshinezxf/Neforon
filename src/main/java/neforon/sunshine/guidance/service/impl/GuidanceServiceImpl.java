package neforon.sunshine.guidance.service.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.guidance.service.GuidanceService;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import neforon.sunshine.vo.GuidanceItemVo;
import neforon.sunshine.vo.GuidanceVo;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceServiceImpl implements GuidanceService {

    private GuidanceDao guidanceDao;

    public GuidanceDao getGuidanceDao() {
        return guidanceDao;
    }

    public void setGuidanceDao(GuidanceDao guidanceDao) {
        this.guidanceDao = guidanceDao;
    }

    @Override
    public ResultData queryQRGuidance() {
        ResultData result = new ResultData();
        List<GuidanceItemVo> lists = new ArrayList<GuidanceItemVo>();
        lists = guidanceDao.queryQRGuidance();
        if (!StringUtils.isEmpty(lists)) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            GuidanceVo guidanceVo = new GuidanceVo(lists);
            result.setData(guidanceVo);
        }
        return result;
    }
}
