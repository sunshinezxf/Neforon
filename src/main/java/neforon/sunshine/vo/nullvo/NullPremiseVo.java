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

    private final String GUIDANCE_TITLE = "内扫二维码加入万科粉丝团";

    private final List<String> GUIDANCE_DETAILS = getDefaultDetail();

    private final String EARN_COMPANY = "万科喊你一起去赚钱";

    private final String EARN_SLOGAN = "赚钱的方法可真多!";

    private final List<String> EARN_METHODS = getEarnMethodList();

    private final String COMPANY_NAME = "万科·新都会";

    private final Integer AVG_PRICE = 21000;

    private final String ACTIVITY_STATUS = "开盘热销中";

    private final String PREMISE_PIC = "/material/buildview/wanke.png";

    private final String COUPON_TITLE = "买多少，送多少!";

    private final String COUPON_DETAIL = "付1万元，总房款立减3万元";

    private final List<String> PREMISE_ADVANTAGES = getPremiseAdvantageList();

    private final String HOUSE_TYPE = "/material/type/wanke.png";

    private final String PROJECT_ADDRESS = "项目地址：金阳西街（南京南站南侧梅香路以西）";

    public NullPremiseVo() {
        super();

        premiseName = PREMISE_NAME;

        qrCode = QR_CODE_PATH;

        guidanceTitle = GUIDANCE_TITLE;
        guidanceDetail = GUIDANCE_DETAILS;

        earnCompany = EARN_COMPANY;
        earnSlogan = EARN_SLOGAN;
        earnMethods = EARN_METHODS;

        companyName = COMPANY_NAME;
        avgPrice = AVG_PRICE;
        activityStatus = ACTIVITY_STATUS;

        premisePic = PREMISE_PIC;

        couponTitle = COUPON_TITLE;
        couponDetail = COUPON_DETAIL;

        premiseAdvantages = PREMISE_ADVANTAGES;

        houseTypePic = HOUSE_TYPE;
        projectAddress = PROJECT_ADDRESS;
    }

    private static List<String> getDefaultDetail() {
        List<String> result = new ArrayList<String>();
        String[] methods = new String[]{"截屏二维码并保存至手机相册", "打开您的微信，点击右上角\"+\"，点击\"扫一扫\"", "进入\"扫一扫界面\"，点击右上角\"相册\"，选中刚保存的二维码图片", "点击\"关注\""};
        for (String item : methods) {
            result.add(item.replaceAll("\"", "&quot;"));
        }
        return result;
    }

    private static List<String> getEarnMethodList() {
        List<String> result = new ArrayList<String>();
        String[] methods = new String[]{"手机点一点，转发来赚钱", "手机写一写，带看来赚钱", "手机拨一拨，约上亲友来赚钱", "手机扫一扫，签到来赚钱"};
        for (String item : methods) {
            result.add(item.replaceAll("\"", "&quot;"));
        }
        return result;
    }

    private static List<String> getPremiseAdvantageList() {
        List<String> result = new ArrayList<String>();
        String[] advantages = new String[]{"区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区", "配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等", "景观优势：一条\"时光漫步道\"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动", "交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线"};
        for (String item : advantages) {
            result.add(item.replaceAll("\"", "&quot;"));
        }
        return result;
    }
}
