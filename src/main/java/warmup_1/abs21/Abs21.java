package warmup_1.abs21;

public class Abs21 {
    private static final int NUMBER = 21;

    public static int abs21(int n) {
        return n > 21 ? 2 * Math.abs(21 - n) : Math.abs(21 - n);
    }
}

