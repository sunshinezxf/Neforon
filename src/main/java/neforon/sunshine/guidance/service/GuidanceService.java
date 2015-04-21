package neforon.sunshine.guidance.service;

import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceService {
    public ResultData queryQRGuidanceById(String projectId);

    public ResultData queryQRGuidances();
}
