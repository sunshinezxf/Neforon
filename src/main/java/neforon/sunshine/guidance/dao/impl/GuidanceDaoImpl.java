package neforon.sunshine.guidance.dao.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.utils.BaseDao;
import neforon.sunshine.vo.GuidanceItemVo;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceDaoImpl extends BaseDao implements GuidanceDao {

    @Override
    public List<GuidanceItemVo> queryQRGuidance() {
        return sqlSession.selectList("guidance.queryGuidance");
    }
}
