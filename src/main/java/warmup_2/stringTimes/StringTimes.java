package warmup_2.stringTimes;

public class StringTimes {


    public static String stringTimes(String str, int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be more tham 0");
        } else if (n == 0) {
            return "";
        }
        String toMultipy = new String(str);
        for (int i = 1; i < n; i++) {
            str += toMultipy;
        }
        return str;
    }
}
