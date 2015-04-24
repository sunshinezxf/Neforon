package neforon.sunshine.model;

/**
 * Created by sunshine on 4/24/15.
 */
public class PremiseAdvantageItem {
    private Integer id;
    private String projectId;
    private String advantage;
    private int step;

    public PremiseAdvantageItem() {

    }

    public PremiseAdvantageItem(String projectId, String advantage, int step) {
        this.projectId = projectId;
        this.advantage = advantage;
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

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
