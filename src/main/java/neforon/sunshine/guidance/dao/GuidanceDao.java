package neforon.sunshine.guidance.dao;


import neforon.sunshine.guidance.vo.GuidanceItemVo;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceDao {

    public List<GuidanceItemVo> selectQRGuidanceById(String projectId);

    public boolean insertGuidanceItem(String projectId, String guidanceTitle, String guidanceDetail, Integer step);

    public boolean updateGuidanceItem(String projectId, String guidanceTitle, String guidanceDetail, Integer step);
}
