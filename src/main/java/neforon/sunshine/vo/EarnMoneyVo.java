package neforon.sunshine.vo;

import java.util.List;

/**
 * Created by sunshine on 4/10/15.
 */
public class EarnMoneyVo {
    private String earnCompany;

    private String earnSlogan;

    private String[] earnMethods;

    public EarnMoneyVo() {

    }

    public EarnMoneyVo(List<EarnMoneyItemVo> itemList) {
        if (itemList.size() != 0) {
            earnCompany = itemList.get(0).getEarnCompany();
            earnSlogan = itemList.get(0).getEarnSlogan();
            earnMethods = new String[itemList.size() + 1];
            for (EarnMoneyItemVo item : itemList) {
                Integer index = item.getStep();
                String desc = item.getMethodDesc();
                earnMethods[index] = item.getMethodDesc();
            }
        }
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

    public String[] getEarnMethods() {
        return earnMethods;
    }

    public void setEarnMethods(String[] earnMethods) {
        this.earnMethods = earnMethods;
    }
}
