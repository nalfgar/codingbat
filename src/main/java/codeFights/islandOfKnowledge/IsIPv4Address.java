package codeFights.islandOfKnowledge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Address {
    public static boolean isIPv4Address(String inputString) {
        Pattern ip4Pattern = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher matcher = ip4Pattern.matcher(inputString);
        boolean result = false;

        if (matcher.find()) {
            for (int i = 1; i < 5; i++) {
                if (isBetween0and255(matcher.group(i))) {
                    result = true;
                } else return false;
            }
        }
        return result;
    }

    private static boolean isBetween0and255(String group) {
        int number = Integer.valueOf(group);
        return (number >= 0 && number <= 255);
    }
}
