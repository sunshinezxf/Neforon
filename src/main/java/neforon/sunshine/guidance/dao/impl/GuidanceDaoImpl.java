package neforon.sunshine.guidance.dao.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.guidance.vo.GuidanceItemVo;
import neforon.sunshine.utils.BaseDao;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceDaoImpl extends BaseDao implements GuidanceDao {

    @Override
    public List<GuidanceItemVo> selectQRGuidanceById(String projectId) {
        return sqlSession.selectList("guidance.selectGuidance", projectId);
    }

    @Override
    public List<GuidanceItemVo> selectQRGuidances() {
        return sqlSession.selectList("");
    }
}
