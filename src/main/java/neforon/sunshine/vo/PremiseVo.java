package neforon.sunshine.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/9/15.
 */
public class PremiseVo {
    protected String premiseName;

    protected String qrCode;

    protected String guidanceTitle;

    protected List<String> guidanceDetail;

    public PremiseVo() {
        premiseName = "";
        qrCode = "";
        guidanceTitle = "";
        guidanceDetail = new ArrayList<String>();
    }

    public void setGuidance(GuidanceVo guidance) {
        guidanceTitle = guidance.getTitle();
        String[] methods = guidance.getMethodDetails();
        for (String item : methods) {
            guidanceDetail.add(item);
        }
    }

    public String getPremiseName() {
        return premiseName;
    }

    public void setPremiseName(String premiseName) {
        this.premiseName = premiseName;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getGuidanceTitle() {
        return guidanceTitle;
    }

    public void setGuidanceTitle(String guidanceTitle) {
        this.guidanceTitle = guidanceTitle;
    }

    public List<String> getGuidanceDetail() {
        return guidanceDetail;
    }

    public void setGuidanceDetail(List<String> guidanceDetail) {
        this.guidanceDetail = guidanceDetail;
    }
}
