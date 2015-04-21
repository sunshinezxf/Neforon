package neforon.sunshine.guidance.facade.impl;

import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.guidance.service.GuidanceService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceFacadeImpl implements GuidanceFacade {
    @Autowired
    private GuidanceService guidanceService;

    public GuidanceService getGuidanceService() {
        return guidanceService;
    }

    public void setGuidanceService(GuidanceService guidanceService) {
        this.guidanceService = guidanceService;
    }

    @Override
    public ResultData queryGuidance(String projectId) {
        ResultData result = new ResultData();
        result = guidanceService.queryQRGuidanceById(projectId);
        return result;
    }

    @Override
    public ResultData queryGuidanceTitle() {
        ResultData result = new ResultData();
        result = guidanceService.queryQRGuidanceTitle();
        return result;
    }

    @Override
    public ResultData queryGuidances() {
        ResultData result = new ResultData();

        return result;
    }
}
