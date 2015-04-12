package neforon.sunshine.vo;

import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageVo;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.earnmoney.vo.EarnMoneyVo;
import neforon.sunshine.guidance.vo.GuidanceVo;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.premiseview.vo.PremiseViewVo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/9/15.
 */
public class PremiseVo {
    protected String premiseName;

    protected String qrCode;

    protected String guidanceTitle;

    protected List<String> guidanceDetail;

    protected String earnCompany;

    protected String earnSlogan;

    protected List<String> earnMethods;

    protected String companyName;

    protected Integer avgPrice;

    protected String activityStatus;

    protected String premisePic;

    protected String couponTitle;

    protected String couponDetail;

    protected List<String> premiseAdvantages;

    protected String houseTypePic;

    protected String projectAddress;

    public PremiseVo() {
        /* 页面显示楼盘的名称 */
        premiseName = "";

        /* 二维码的路径 */
        qrCode = "";

        /* 二维码的扫描指南 */
        guidanceTitle = "";
        guidanceDetail = new ArrayList<String>();

        /* 赚钱的方法可真多的标题、副标题、内容 */
        earnCompany = "";
        earnSlogan = "";
        earnMethods = new ArrayList<String>();

        /* 活动的楼盘 */
        companyName = "";
        avgPrice = 0;
        activityStatus = "";

        /* 楼盘图片 */
        premisePic = "";

        /* 优惠活动介绍 */
        couponTitle = "";
        couponDetail = "";

        /*楼盘优势介绍*/
        premiseAdvantages = new ArrayList<String>();

        /* 户型介绍及项目地址 */
        houseTypePic = "";
        projectAddress = "";
    }

    public void setGuidance(GuidanceVo guidance) {
        guidanceTitle = guidance.getTitle();
        String[] methods = guidance.getMethodDetails();
        for (String item : methods) {
            guidanceDetail.add(item);
        }
    }

    public void setEarnMoney(EarnMoneyVo earnMoney) {
        earnCompany = earnMoney.getEarnCompany();
        earnSlogan = earnMoney.getEarnSlogan();
        String[] methods = earnMoney.getEarnMethods();
        for (String item : methods) {
            earnMethods.add(item);
        }
    }

    public void setAveragePrice(AveragePriceVo averagePrice) {
        companyName = averagePrice.getCompanyName();
        avgPrice = averagePrice.getAveragePrice();
        activityStatus = averagePrice.getActivityState();
    }

    public void setPremiseView(PremiseViewVo premiseView) {
        premisePic = premiseView.getPremisePicPath();
    }

    public void setCoupon(CouponVo coupon) {
        couponTitle = coupon.getCouponTitle();
        couponDetail = coupon.getCouponDetail();
    }

    public void setPremiseAdvantages(PremiseAdvantageVo premiseAdvantage) {
        String[] advantages = premiseAdvantage.getPremiseAdvantages();
        for (String item : advantages) {
            premiseAdvantages.add(item);
        }
    }

    public void setHouseType(HouseTypeVo houseType) {
        houseTypePic = houseType.getHouseTypePic();
        projectAddress = houseType.getProjectAddress();
    }

    public String getPremiseName() {
        return premiseName;
    }

    public void setPremiseName(String premiseName) {
        this.premiseName = premiseName;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getGuidanceTitle() {
        return guidanceTitle;
    }

    public void setGuidanceTitle(String guidanceTitle) {
        this.guidanceTitle = guidanceTitle;
    }

    public List<String> getGuidanceDetail() {
        return guidanceDetail;
    }

    public void setGuidanceDetail(List<String> guidanceDetail) {
        this.guidanceDetail = guidanceDetail;
    }

    public String getEarnCompany() {
        return earnCompany;
    }

    public void setEarnCompany(String earnCompany) {
        this.earnCompany = earnCompany;
    }

    public String getEarnSlogan() {
        return earnSlogan;
    }

    public void setEarnSlogan(String earnSlogan) {
        this.earnSlogan = earnSlogan;
    }

    public List<String> getEarnMethods() {
        return earnMethods;
    }

    public void setEarnMethods(List<String> earnMethods) {
        this.earnMethods = earnMethods;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getPremisePic() {
        return premisePic;
    }

    public void setPremisePic(String premisePic) {
        this.premisePic = premisePic;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getCouponDetail() {
        return couponDetail;
    }

    public void setCouponDetail(String couponDetail) {
        this.couponDetail = couponDetail;
    }

    public List<String> getPremiseAdvantages() {
        return premiseAdvantages;
    }

    public void setPremiseAdvantages(List<String> premiseAdvantages) {
        this.premiseAdvantages = premiseAdvantages;
    }

    public String getHouseTypePic() {
        return houseTypePic;
    }

    public void setHouseTypePic(String houseTypePic) {
        this.houseTypePic = houseTypePic;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }
}
