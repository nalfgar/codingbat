package codeFights;

import org.junit.Test;

import static codeFights.MatrixElementsSum.sumMatrix;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MatrixElementsSumTest {

    @Test
    public void testOne() {
        int[][] matrix = new int[][]{{0,1,1,2},
                                    {0,5,0,0},
                                    {2,0,3,3}};

        assertThat(MatrixElementsSum.matrixElementsSum(matrix)).isEqualTo(9);
    }

    @Test
    public void testTwo() {
        int[][] matrix = new int[][]{{1,1,1,0},
                                    {0,5,0,1},
                                    {2,1,3,10}};

        assertThat(MatrixElementsSum.matrixElementsSum(matrix)).isEqualTo(9);
    }




    @Test
    public void testSumMatrixZero() {
        int[][] matrix = new int[][]{{0,0,0,0},{0,0,0,0}};
        int[][] matrix1 = new int[][]{{0,1,0,0},{0,1,0,0}};
        int[][] matrix2 = new int[][]{{2,2,2,2},{2,2,2,2}};

        assertThat(sumMatrix(matrix)).isEqualTo(0);
        assertThat(sumMatrix(matrix1)).isEqualTo(2);
        assertThat(sumMatrix(matrix2)).isEqualTo(16);
    }
}
