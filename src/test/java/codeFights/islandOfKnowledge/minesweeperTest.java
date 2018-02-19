package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.Minesweeper.minesweeper;
import static org.assertj.core.api.Assertions.assertThat;

public class minesweeperTest {

    @Test
    public void testOne() {
        boolean[][] matrix = new boolean[][]{{true,false,false},{false,true,false},{false,false,false}};
        int[][] matrixOfNeighbours = new int[][]{{1,2,1},{2,1,1},{1,1,1}};

        assertThat(minesweeper(matrix)).isEqualTo(matrixOfNeighbours);
    }

    @Test
    public void testTwo() {
        boolean[][] matrix = new boolean[][]{{false,false,false},{false,false,false}};
        int[][] matrixOfNeighbours = new int[][]{{0,0,0},{0,0,0}};

        assertThat(minesweeper(matrix)).isEqualTo(matrixOfNeighbours);
    }
}
