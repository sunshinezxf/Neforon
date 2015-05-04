package neforon.sunshine.coupon.dao.impl;

import neforon.sunshine.coupon.dao.CouponDao;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.model.Coupon;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;

/**
 * Created by sunshine on 4/13/15.
 */
public class CouponDaoImpl extends BaseDao implements CouponDao {
    @Override
    public CouponVo selectCouponById(String projectId) {
        return sqlSession.selectOne("coupon.selectCoupon", projectId);
    }

    @Override
    public boolean insertCoupon(Coupon coupon) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", coupon.getProjectId());
        params.put("couponDetail", coupon.getCouponDetail());
        return (sqlSession.insert("coupon.insertCoupon", params) != 0) ? true : false;
    }
}
