package neforon.sunshine.vo;

/**
 * Created by sunshine on 4/10/15.
 */
public class EarnMoneyItemVo {
    private String earnCompany;

    private String earnSlogan;

    private String methodDesc;

    private Integer step;

    public EarnMoneyItemVo() {

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
