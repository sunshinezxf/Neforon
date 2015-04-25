package neforon.sunshine.coupon.facade;

import neforon.sunshine.model.Coupon;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/13/15.
 */
public interface CouponFacade {
    public ResultData queryCoupon(String projectId);

    public ResultData addCoupon(Coupon coupon);
}
