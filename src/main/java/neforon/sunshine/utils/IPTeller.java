package neforon.sunshine.utils;

/**
 * Created by sunshine on 4/26/15.
 */
public class IPTeller {
    private final static String HOST = "http://www.xiaolukaimen.cn:8080";

    public static String getIPv4Address(String projectId) {
        StringBuffer sb = new StringBuffer();
        sb.append(HOST);
        sb.append("/neforon/premise/");
        sb.append(projectId);
        return sb.toString();
    }
}
