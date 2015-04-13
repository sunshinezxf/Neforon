package neforon.sunshine.coupon.dao.impl;

import neforon.sunshine.coupon.dao.CouponDao;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.utils.BaseDao;

/**
 * Created by sunshine on 4/13/15.
 */
public class CouponDaoImpl extends BaseDao implements CouponDao {
    @Override
    public CouponVo selectCouponById(String projectId) {
        return sqlSession.selectOne("coupon.selectCoupon", projectId);
    }
}
