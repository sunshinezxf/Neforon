package neforon.sunshine.guidance.service;

import neforon.sunshine.model.GuidanceItem;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceService {
    public ResultData queryQRGuidanceById(String projectId);

    public ResultData addQRGuidances(List<GuidanceItem> guidances);

    public ResultData modifyGuidances(List<GuidanceItem> guidances);
}
