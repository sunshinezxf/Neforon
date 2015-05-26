package neforon.sunshine.guidance.service.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.guidance.service.GuidanceService;
import neforon.sunshine.guidance.vo.GuidanceItemVo;
import neforon.sunshine.guidance.vo.GuidanceVo;
import neforon.sunshine.model.GuidanceItem;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceServiceImpl implements GuidanceService {
    @Autowired
    private GuidanceDao guidanceDao;

    @Override
    public ResultData queryQRGuidanceById(String projectId) {
        ResultData result = new ResultData();
        List<GuidanceItemVo> lists = new ArrayList<GuidanceItemVo>();
        lists = guidanceDao.selectQRGuidanceById(projectId);
        if (!StringUtils.isEmpty(lists)) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            GuidanceVo guidanceVo = new GuidanceVo(lists);
            result.setData(guidanceVo);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }

    @Override
    public ResultData addQRGuidances(List<GuidanceItem> guidances) {
        ResultData result = new ResultData();
        for (GuidanceItem item : guidances) {
            boolean status = guidanceDao.insertGuidanceItem(item.getProjectId(), item.getGuidanceTitle(), item.getGuidanceDetail(), item.getStep());
            if (!status) {
                result.setStatusCode(ResponseCode.MESSAGE_NULL);
                return result;
            }
        }
        result.setStatusCode(ResponseCode.MESSAGE_OK);
        return result;
    }

    @Override
    public ResultData modifyGuidances(List<GuidanceItem> guidances) {
        ResultData result = new ResultData();

        return result;
    }
}
