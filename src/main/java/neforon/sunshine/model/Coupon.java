package neforon.sunshine.model;

/**
 * Created by sunshine on 4/23/15.
 */
public class Coupon {
    private Integer id;
    private String projectId;
    private String couponDetail;

    public Coupon() {

    }

    public Coupon(String projectId, String couponDetail) {
        this.projectId = projectId;
        this.couponDetail = couponDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCouponDetail() {
        return couponDetail;
    }

    public void setCouponDetail(String couponDetail) {
        this.couponDetail = couponDetail;
    }
}
