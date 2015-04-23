package neforon.sunshine.utils;

/**
 * Created by sunshine on 4/23/15.
 */
public class DataHandle {
    public static String handleData(String input) {
        return input == null ? input : input.replaceAll("\"", "&quot;");
    }
}
