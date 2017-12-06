package warmup_1.notString;

public class NotString {
    public static String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }
}
