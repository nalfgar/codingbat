package warmup_1.backAround;

public class BackAround {
    public static String backAround(String str) {
        return String.valueOf(str.charAt(str.length()-1)) + str + String.valueOf(str.charAt(str.length()-1));
    }
}
