package neforon.sunshine.model;

/**
 * Created by sunshine on 4/23/15.
 */
public class EarnItem {
    private Integer id;
    private String projectId;
    private String earnCompany;
    private String earnSlogan;
    private String methodDesc;
    private Integer step;

    public EarnItem() {

    }

    public EarnItem(String projectId, String earnCompany, String earnSlogan, String methodDesc, Integer step) {
        this.projectId = projectId;
        this.earnCompany = earnCompany;
        this.earnSlogan = earnSlogan;
        this.methodDesc = methodDesc;
        this.step = step;
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

    public String getMethodDesc() {
        return methodDesc;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }
}
