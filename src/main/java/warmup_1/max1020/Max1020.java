package warmup_1.max1020;

public class Max1020 {

    public static int max1020(int a, int b) {
        boolean aInRange = isValueBettwen10And20(a);
        boolean bInRange = isValueBettwen10And20(b);

        if (aInRange && bInRange) {
            return getLarger(a, b);
        } else if (aInRange && !bInRange) {
            return a;
        } else if (!aInRange && bInRange) {
            return b;
        }
        return 0;
    }

    private static int getLarger(int a, int b) {
        return a > b ? a : b;
    }

    private static boolean isValueBettwen10And20(int a) {
        return a >= 10 && a <= 20;
    }
}
