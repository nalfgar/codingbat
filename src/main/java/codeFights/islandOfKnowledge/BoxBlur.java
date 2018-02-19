package codeFights.islandOfKnowledge;

public class BoxBlur {
    public static int[][] boxBlur(int[][] image) {
        int[][] blured = new int[image.length-2][image[0].length-2];

        for (int i = 1; i < image.length-1; i++) {
            for (int j = 1; j < image[0].length-1; j++) {
                blured[i-1][j-1] = getBluredPixel(image, i, j);
            }
        }
        return blured;
    }

    private static int getBluredPixel(int[][] image, int i, int j) {
        int sum = 0;
        for (int k = i-1; k < i + 2; k++) {
            for (int l = j-1; l < j+2; l++) {
                sum += image[k][l];
            }
        }
        return sum/9;
    }
}
