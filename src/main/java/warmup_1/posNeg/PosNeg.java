package warmup_1.posNeg;

public class PosNeg {


    public static boolean posNeg(int a, int b, boolean negative) {
        if (((a < 0 && b > 0) || (a > 0 && b < 0)) && !negative) {
            return true;
        } else if (negative && a < 0 && b < 0) {
            return true;
        }
        return false;
    }
}
