package AP_1.hasOne;

public class HasOne {
    public static boolean hasOne(int i) {
        if (i<=0) {
            throw new IllegalArgumentException();
        }
        return String.valueOf(i).contains("1");
    }
}