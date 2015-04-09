package neforon.sunshine.vo;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceItemVo {
    private String title;
    private Integer step;
    private String description;

    public GuidanceItemVo() {

    }

    public GuidanceItemVo(String title, String description, Integer step) {
        this.title = title;
        this.description = description;
        this.step = step;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
