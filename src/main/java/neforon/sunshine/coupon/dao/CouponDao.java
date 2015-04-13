package neforon.sunshine.coupon.dao;

import neforon.sunshine.coupon.vo.CouponVo;

/**
 * Created by sunshine on 4/13/15.
 */
public interface CouponDao {
    public CouponVo selectCouponById(String projectId);
}
