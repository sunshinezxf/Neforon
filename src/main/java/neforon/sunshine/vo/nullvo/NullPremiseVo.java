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

    private final String EARN_COMPANY = "万科喊你一起去赚钱";

    private final String EARN_SLOGAN = "赚钱的方法可真多!";

    private final List<String> EARN_METHODS = getEarnMethodList();

    public NullPremiseVo() {
        super();

        premiseName = PREMISE_NAME;

        qrCode = QR_CODE_PATH;

        guidanceTitle = GUIDANCE_TITLE;
        guidanceDetail = GUIDANCE_DETAILS;

        earnCompany = EARN_COMPANY;
        earnSlogan = EARN_SLOGAN;
        earnMethods = EARN_METHODS;
    }

    private static List<String> getDefaultDetail() {
        List<String> result = new ArrayList<String>();
        String[] methods = new String[]{"截屏二维码并保存至手机相册", "打开您的微信，点击右上角\"+\"，点击\"扫一扫\"", "进入\"扫一扫界面\"，点击右上角\"相册\"，选中刚保存的二维码图片", "点击\"关注\""};
        for (String item : methods) {
            result.add(item);
        }
        return result;
    }

    private static List<String> getEarnMethodList() {
        List<String> result = new ArrayList<String>();
        String[] methods = new String[]{"手机点一点，转发来赚钱", "手机写一写，带看来赚钱", "手机拨一拨，约上亲友来赚钱", "手机扫一扫，签到来赚钱"};
        for (String item : methods) {
            result.add(item);
        }
        return result;
    }
}
