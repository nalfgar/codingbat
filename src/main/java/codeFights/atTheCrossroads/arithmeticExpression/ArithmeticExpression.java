package codeFights.atTheCrossroads.arithmeticExpression;

public class ArithmeticExpression {
    public static boolean arithmeticExpression(int a, int b, int c) {
        boolean[] results = new boolean[4];

        if (a + b == c) results[0] = true;
        if (a - b == c) results[1] = true;
        if (a * b == c) results[2] = true;

        double doubleA = (double) a;
        double doubleB = (double) b;
        double doubleC = (double) c;
        if (doubleA / doubleB == doubleC) results[3] = true;

        return isTrueInArray(results);
    }

    private static boolean isTrueInArray(boolean[] results) {
        for (boolean result : results) {
            if (result == true){
                return true;
            }
        }
        return false;
    }
}
