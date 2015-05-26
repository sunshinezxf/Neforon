package neforon.sunshine.guidance.facade;

import neforon.sunshine.model.GuidanceItem;
import neforon.sunshine.utils.ResultData;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceFacade {
    public ResultData queryGuidance(String projectId);

    public ResultData addGuidance(List<GuidanceItem> guidances);

    public ResultData modifyGuidance(List<GuidanceItem> guidances);
}
