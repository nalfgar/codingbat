package codeFights.islandOfKnowledge;

public class Minesweeper {
    public static int[][] minesweeper(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        boolean[][] extendedMatrix = new boolean[matrix.length + 2][matrix[0].length + 2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                extendedMatrix[i + 1][j + 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = countTrues(extendedMatrix, i + 1, j + 1);
            }
        }

        return result;
    }

    private static int countTrues(boolean[][] extendedMatrix, int i, int j) {
        int sum = 0;
        if (extendedMatrix[i][j] == true){
            sum--;
        }

        for (int k = i - 1; k < i + 2; k++) {
            for (int l = j - 1; l < j + 2; l++) {
                if (extendedMatrix[k][l] == true){
                    sum++;
                }
            }

        }
        return sum;
    }
}
