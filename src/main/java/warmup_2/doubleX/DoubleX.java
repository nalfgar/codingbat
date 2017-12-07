package warmup_2.doubleX;

public class DoubleX {
    public static boolean doubleX(String str) {
        boolean result = false;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i) == str.charAt(i+1)){
                result = true;
                break;
            }
        }
        return result;
    }
}
