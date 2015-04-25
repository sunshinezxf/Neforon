package neforon.sunshine.coupon.facade.impl;

import neforon.sunshine.coupon.facade.CouponFacade;
import neforon.sunshine.coupon.service.CouponService;
import neforon.sunshine.model.Coupon;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class CouponFacadeImpl implements CouponFacade {
    @Autowired
    private CouponService couponService;

    @Override
    public ResultData queryCoupon(String projectId) {
        ResultData result = new ResultData();
        result = couponService.queryCouponById(projectId);
        return result;
    }

    @Override
    public ResultData addCoupon(Coupon coupon) {
        ResultData result = new ResultData();
        result = couponService.addCoupon(coupon);
        return result;
    }
}
