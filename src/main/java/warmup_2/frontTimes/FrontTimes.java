package warmup_2.frontTimes;

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder("");
        if (n < str.length()) {
            for (int i = 0; i < n; i++) {
                result.append(str.substring(0, 3));
            }
        } else {
            for (int i = 0; i < n; i++) {
                result.append(str);
            }
        }

        return result.toString();
    }
}