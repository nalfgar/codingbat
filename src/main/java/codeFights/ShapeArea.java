package codeFights;

public class ShapeArea {
    public static int shapeArea(int n) {
        int maxL = (2 * n) - 1;
        int maxArea = maxL * maxL;
        int blankArea = 0;

        for (int i = 1; i < n; i++) {
            blankArea += i;
        }

        return maxArea - (blankArea * 4);
    }
}
