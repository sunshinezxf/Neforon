package neforon.sunshine.vo.nullvo;

import neforon.sunshine.vo.PremiseVo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 4/9/15.
 */
public class NullPremiseVo extends PremiseVo {
    private final String PREMISE_NAME = "万科·新都会";

    private final String QR_CODE_PATH = "/material/qrcode/example.png";

    private final String GUIDANCE_TITLE = "二维码内扫加关注方法";

    private final List<String> GUIDANCE_DETAILS = getDefaultDetail();

    public NullPremiseVo() {
        super();
        premiseName = PREMISE_NAME;
        qrCode = QR_CODE_PATH;
        guidanceTitle = GUIDANCE_TITLE;
        guidanceDetail = GUIDANCE_DETAILS;
    }

    private static List<String> getDefaultDetail() {
        List<String> result = new ArrayList<String>();
        String[] methods = new String[]{"截屏二维码并保存至手机相册", "打开您的微信，点击右上角\"+\"，点击\"扫一扫\"", "进入\"扫一扫界面\"，点击右上角\"相册\"，选中刚保存的二维码图片", "点击\"关注\""};
        for (String item : methods) {
            result.add(item);
        }
        return result;
    }
}
