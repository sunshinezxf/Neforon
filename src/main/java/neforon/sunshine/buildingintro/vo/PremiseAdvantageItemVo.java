package neforon.sunshine.buildingintro.vo;

/**
 * Created by sunshine on 4/12/15.
 */
public class PremiseAdvantageItemVo {
    private String advantage;

    private Integer index;

    public PremiseAdvantageItemVo() {
        advantage = "";
        index = 0;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
