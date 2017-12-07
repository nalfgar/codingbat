package warmup_1.lastDigit;

public class LastDigit {
    public static boolean lastDigit(int a, int b) {
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        return Integer.valueOf(aString.charAt(aString.length()-1))==Integer.valueOf(bString.charAt(bString.length()-1));
    }
}
