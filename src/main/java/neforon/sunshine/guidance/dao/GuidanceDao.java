package neforon.sunshine.guidance.dao;


import neforon.sunshine.guidance.vo.GuidanceItemVo;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public interface GuidanceDao {

    public List<GuidanceItemVo> queryQRGuidance();
}
