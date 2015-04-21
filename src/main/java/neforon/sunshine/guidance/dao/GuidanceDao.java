package neforon.sunshine.guidance.dao;


import neforon.sunshine.guidance.vo.GuidanceItemVo;
import neforon.sunshine.model.GuidanceItem;
import neforon.sunshine.model.GuidanceTitle;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceDao {

    public List<GuidanceItemVo> selectQRGuidanceById(String projectId);

    public GuidanceTitle selectGuidanceTitle();

    public List<GuidanceItem> selectQRGuidances();
}
