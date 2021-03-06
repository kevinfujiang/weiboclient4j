package weiboclient4j.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Hover Ruan
 */
public final class StringUtils {
    private StringUtils() {
    }

    public static boolean isBlank(String value) {
        return !isNotBlank(value);
    }

    public static boolean isNotBlank(String value) {
        return value != null && value.trim().length() > 0;
    }

    public static String join(Collection<String> strings, String sep) {
        StringBuilder buf = new StringBuilder();
        for (String str : strings) {
            buf.append(sep).append(str);
        }

        return buf.substring(sep.length());
    }

    public static String join(Object[] array, String sep) {
        return join(toStringArray(array), sep);
    }

    public static Collection<String> toStringArray(Object[] array) {
        Collection<String> result = new ArrayList<String>(array.length);
        for (Object coordinate : array) {
            result.add(coordinate.toString());
        }

        return result;
    }
}
