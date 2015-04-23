package neforon.sunshine.model;

/**
 * Created by sunshine on 4/23/15.
 */
public class PremiseView {
    private Integer id;
    private String projectId;
    private String premiseViewPath;

    public PremiseView() {

    }

    public PremiseView(String projectId, String premiseViewPath) {
        this.projectId = projectId;
        this.premiseViewPath = premiseViewPath;
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

    public String getPremiseViewPath() {
        return premiseViewPath;
    }

    public void setPremiseViewPath(String premiseViewPath) {
        this.premiseViewPath = premiseViewPath;
    }
}
