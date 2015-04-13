package neforon.sunshine.guidance.vo;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceItemVo {
    private String title;
    private Integer step;
    private String description;

    public GuidanceItemVo() {
        title = "";
        step = 0;
        description = "";
    }

    public GuidanceItemVo(String title, Integer step, String description) {
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
