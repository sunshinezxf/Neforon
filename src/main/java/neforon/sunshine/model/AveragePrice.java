package neforon.sunshine.model;

/**
 * Created by sunshine on 4/23/15.
 */
public class AveragePrice {
    private Integer id;
    private String projectId;
    private String companyName;
    private Integer avgPrice;
    private String activityState;

    public AveragePrice() {

    }

    public AveragePrice(String projectId, String companyName, Integer avgPrice, String activityState) {
        this.projectId = projectId;
        this.companyName = companyName;
        this.avgPrice = avgPrice;
        this.activityState = activityState;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState;
    }
}
