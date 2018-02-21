package codeFights.Arrays;

public class RotateImage {
    public static int[][] rotateImage(int[][] a) {
        if (a.length == 1 && a[0].length == 1) return a;

        int[][] result = new int[a[0].length][a.length];

        int rowCounter = result[0].length-1;
        for (int[] ints : a) {
            result = putRowInI(ints, result, rowCounter);
            rowCounter--;
        }
        return result;
    }

    private static int[][] putRowInI(int[] row, int[][] result, int k) {
        int rowCounter = 0;
        for (int i = 0; i < result.length; i++) {
            result[i][k] = row[rowCounter];
            rowCounter++;
        }
        return result;
    }
}
