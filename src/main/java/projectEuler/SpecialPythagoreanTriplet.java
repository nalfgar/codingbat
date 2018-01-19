package projectEuler;

public class SpecialPythagoreanTriplet {

    public static int[] specialPythagoreanTriplet(int n) {
        int[] result = new int[3];
        double a2 = 0;
        double b2 = 0;

        for (int i = 2; i < n; i++) {
            for (int j = i; j < n; j++) {
                a2 = i * i;
                b2 = j * j;
                if (isSquareRootInteger(a2, b2) && (i + j + (int) Math.sqrt(a2 + b2) == 1000)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = (int) Math.sqrt(a2 + b2);
                }
            }
        }
        return result;
    }

    private static boolean isSquareRootInteger(double a2, double b2) {
        double sqrt = Math.sqrt(a2 + b2);
        double x = sqrt - (int) sqrt;

        if (x == 0) {
            return true;
        }
        return false;
    }
}
