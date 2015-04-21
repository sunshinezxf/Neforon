package neforon.sunshine.guidance.dao.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.guidance.vo.GuidanceItemVo;
import neforon.sunshine.model.GuidanceItem;
import neforon.sunshine.model.GuidanceTitle;
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
    public GuidanceTitle selectGuidanceTitle() {
        return sqlSession.selectOne("guidance.selectGuidanceTitle");
    }

    @Override
    public List<GuidanceItem> selectQRGuidances() {
        return sqlSession.selectList("guidance.selectGuidances");
    }
}
