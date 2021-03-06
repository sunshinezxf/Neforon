package neforon.sunshine.coupon.service;

import neforon.sunshine.model.Coupon;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface CouponService {
    public ResultData queryCouponById(String projectId);

    public ResultData addCoupon(Coupon coupon);
}
