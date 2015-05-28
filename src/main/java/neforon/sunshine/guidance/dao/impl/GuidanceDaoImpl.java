package neforon.sunshine.guidance.dao.impl;

import neforon.sunshine.guidance.dao.GuidanceDao;
import neforon.sunshine.guidance.vo.GuidanceItemVo;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceDaoImpl extends BaseDao implements GuidanceDao {

    @Override
    public List<GuidanceItemVo> selectQRGuidanceById(String projectId) {
        try {
            return sqlSession.selectList("guidance.selectGuidance", projectId);
        } catch (Exception e) {
            return sqlSession.selectList("guidance.selectGuidance", projectId);
        }
    }

    @Override
    public boolean insertGuidanceItem(String projectId, String guidanceTitle, String guidanceDetail, Integer step) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", projectId);
        params.put("guidanceTitle", guidanceTitle);
        params.put("guidanceDetail", guidanceDetail);
        params.put("step", step);
        try {
            return (sqlSession.insert("guidance.insertGuidanceItem", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("guidance.insertGuidanceItem", params) != 0) ? true : false;
        }
    }
}
