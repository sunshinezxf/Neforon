package neforon.sunshine.averageprice.vo;

/**
 * Created by sunshine on 4/11/15.
 */
public class AveragePriceVo {
    private String companyName;

    private Integer averagePrice;

    private String activityState;

    public AveragePriceVo() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Integer averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState;
    }
}
