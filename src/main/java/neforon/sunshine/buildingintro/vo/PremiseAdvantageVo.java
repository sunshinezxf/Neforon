package neforon.sunshine.buildingintro.vo;

import java.util.List;

/**
 * Created by sunshine on 4/12/15.
 */
public class PremiseAdvantageVo {
    private String[] premiseAdvantages;

    public PremiseAdvantageVo() {

    }

    public PremiseAdvantageVo(List<PremiseAdvantageItemVo> list) {
        if (list.size() != 0) {
            premiseAdvantages = new String[list.size() + 1];
        }
        for (PremiseAdvantageItemVo item : list) {
            premiseAdvantages[item.getIndex()] = item.getAdvantage();
        }
    }

    public String[] getPremiseAdvantages() {
        return premiseAdvantages;
    }

    public void setPremiseAdvantages(String[] premiseAdvantages) {
        this.premiseAdvantages = premiseAdvantages;
    }
}
