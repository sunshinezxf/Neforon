package neforon.sunshine.vo;

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
}
