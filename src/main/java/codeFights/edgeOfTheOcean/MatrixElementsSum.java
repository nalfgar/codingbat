package codeFights.edgeOfTheOcean;

public class MatrixElementsSum {

    public static int matrixElementsSum(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            newMatrix[0][i] = matrix[0][i];
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (newMatrix[i-1][j] != 0) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }

        return sumMatrix(newMatrix);
    }


    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j : matrix[i]) {
                sum += j;
            }
        }
        return sum;
    }
}