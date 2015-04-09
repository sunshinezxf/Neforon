package neforon.sunshine.vo;

import java.util.List;

/**
 * Created by sunshine on 4/8/15.
 */
public class GuidanceVo {
    private String title;

    private String[] methodDetails;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getMethodDetails() {
        return methodDetails;
    }

    public void setMethodDetails(String[] methodDetails) {
        this.methodDetails = methodDetails;
    }

    public GuidanceVo() {

    }

    public GuidanceVo(List<GuidanceItemVo> list) {
        if (list.size() != 0) {
            title = list.get(0).getTitle();
            methodDetails = new String[list.size() + 1];
            for (GuidanceItemVo item : list) {
                Integer index = item.getStep();
                String detail = item.getDescription();
                methodDetails[index] = detail;
            }
        }
    }
}
