package neforon.sunshine.vo;

import neforon.sunshine.averageprice.vo.AveragePriceVo;
import neforon.sunshine.buildingintro.vo.PremiseAdvantageVo;
import neforon.sunshine.coupon.vo.CouponVo;
import neforon.sunshine.earnmoney.vo.EarnVo;
import neforon.sunshine.guidance.vo.GuidanceVo;
import neforon.sunshine.housetype.vo.HouseTypeVo;
import neforon.sunshine.premiseview.vo.PremiseViewVo;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.qrcode.vo.QRCodeVo;

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

    protected String earnSloganPic;

    protected String companyName;

    protected Integer avgPrice;

    protected String activityStatus;

    protected String premisePic;

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

        /* 赚钱的方法可真多标语 */
        earnSloganPic = "";

        /* 活动的楼盘 */
        companyName = "";
        avgPrice = 0;
        activityStatus = "";

        /* 楼盘图片 */
        premisePic = "";

        /* 优惠活动介绍 */
        couponDetail = "";

        /*楼盘优势介绍*/
        premiseAdvantages = new ArrayList<String>();

        /* 户型介绍及项目地址 */
        houseTypePic = "";
        projectAddress = "";
    }

    public void setProject(ProjectVo project) {
        premiseName = project.getProjectName();
    }

    public void setCode(QRCodeVo code) {
        qrCode = code.getqRCodePath();
    }

    public void setGuidance(GuidanceVo guidance) {
        guidanceTitle = guidance.getTitle();
        String[] methods = guidance.getMethodDetails();
        for (String item : methods) {
            if (item == null || item.equals("")) {
                continue;
            }
            guidanceDetail.add(item);
        }
    }

    public void setEarnSlogan(EarnVo earn) {
        earnSloganPic = earn.getEarnSloganPic();
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
        couponDetail = coupon.getCouponDetail();
    }

    public void setPremiseAdvantages(PremiseAdvantageVo premiseAdvantage) {
        String[] advantages = premiseAdvantage.getPremiseAdvantages();
        for (String item : advantages) {
            if (item == null || item.equals("")) {
                continue;
            }
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

    public String getEarnSloganPic() {
        return earnSloganPic;
    }

    public void setEarnSloganPic(String earnSloganPic) {
        this.earnSloganPic = earnSloganPic;
    }
}
