package codeFights.edgeOfTheOcean;

public class AdjacentElementsProduct {
    public static int adjacentElementsProduct(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        int multi;

        for (int i = 0; i < inputArray.length - 1; i++) {
            multi = inputArray[i] * inputArray[i + 1];
            if (multi > max) {
                max = multi;
            }
        }
        return max;
    }
}
