package codeFights.throughTheFog;

public class AbsoluteValuesSumMinimization {
    public static int absoluteValuesSumMinimization(int[] a) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minX = 0;

        for (int x = a[0]; x <= a[a.length - 1]; x++) {
            for (int i : a) {
                sum += Math.abs(i - x);
            }
            if (sum < min) {
                min = sum;
                minX = x;
            }
            sum = 0;
        }

        return minX;
    }
}
