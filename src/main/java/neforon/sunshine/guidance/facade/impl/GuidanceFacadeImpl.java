package neforon.sunshine.guidance.facade.impl;

import neforon.sunshine.guidance.facade.GuidanceFacade;
import neforon.sunshine.guidance.service.GuidanceService;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceFacadeImpl implements GuidanceFacade {
    private GuidanceService guidanceService;

    public GuidanceService getGuidanceService() {
        return guidanceService;
    }

    public void setGuidanceService(GuidanceService guidanceService) {
        this.guidanceService = guidanceService;
    }

    @Override
    public ResultData queryGuidance() {
        ResultData result = new ResultData();
        result = guidanceService.queryQRGuidance();
        return result;
    }
}
