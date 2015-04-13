package neforon.sunshine.buildingintro.service.impl;

import neforon.sunshine.buildingintro.dao.PremiseAdvantageDao;
import neforon.sunshine.buildingintro.service.PremiseAdvantageService;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageItemVo;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public class PremiseAdvantageServiceImpl implements PremiseAdvantageService {
    @Autowired
    private PremiseAdvantageDao premiseAdvantageDao;

    @Override
    public ResultData queryPremiseAdvantagesById(String projectId) {
        ResultData result = new ResultData();
        List<PremiseAdvantageItemVo> list = premiseAdvantageDao.selectPremiseAdvantageById(projectId);
        if (StringUtils.isEmpty(list)) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            PremiseAdvantageVo vo = new PremiseAdvantageVo(list);
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
