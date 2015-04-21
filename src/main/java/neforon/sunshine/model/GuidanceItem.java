package neforon.sunshine.model;

/**
 * Created by sunshine on 4/21/15.
 */
public class GuidanceItem {
    private Integer id;
    private String projectId;
    private String guidanceTitle;
    private String guidanceDetail;
    private Integer step;

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

    public String getGuidanceTitle() {
        return guidanceTitle;
    }

    public void setGuidanceTitle(String guidanceTitle) {
        this.guidanceTitle = guidanceTitle;
    }

    public String getGuidanceDetail() {
        return guidanceDetail;
    }

    public void setGuidanceDetail(String guidanceDetail) {
        this.guidanceDetail = guidanceDetail;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }
}
