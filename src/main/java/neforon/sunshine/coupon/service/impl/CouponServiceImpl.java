package neforon.sunshine.coupon.service.impl;

import neforon.sunshine.coupon.dao.CouponDao;
import neforon.sunshine.coupon.service.CouponService;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.model.Coupon;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/13/15.
 */
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponDao couponDao;

    @Override
    public ResultData queryCouponById(String projectId) {
        ResultData result = new ResultData();
        CouponVo vo = couponDao.selectCouponById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }

    @Override
    public ResultData addCoupon(Coupon coupon) {
        ResultData result = new ResultData();
        boolean status = couponDao.insertCoupon(coupon);
        if (status) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(status);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }
}
