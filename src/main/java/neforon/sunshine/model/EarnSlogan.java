package neforon.sunshine.model;

/**
 * Created by sunshine on 5/4/15.
 */
public class EarnSlogan {
    private Integer id;
    private String projectId;
    private String earnSloganPic;

    public EarnSlogan() {

    }

    public EarnSlogan(String projectId, String earnSloganPic) {
        this.projectId = projectId;
        this.earnSloganPic = earnSloganPic;
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

    public String getEarnSloganPic() {
        return earnSloganPic;
    }

    public void setEarnSloganPic(String earnSloganPic) {
        this.earnSloganPic = earnSloganPic;
    }
}
