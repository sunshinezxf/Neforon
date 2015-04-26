package neforon.sunshine.utils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by sunshine on 4/26/15.
 */
public class IPTeller {
    public static String getIPv4Address() {
        try {
            Enumeration internetFaces = NetworkInterface.getNetworkInterfaces();
            InetAddress address = null;
            while (internetFaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) internetFaces.nextElement();
                Enumeration addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    address = (InetAddress) addresses.nextElement();
                    if (address != null && address instanceof Inet4Address) {
                        return address.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return null;
    }
}
