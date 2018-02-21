package codeFights.Arrays;

import org.junit.Test;

import static codeFights.Arrays.Sudoku2.sudoku2;
import static org.assertj.core.api.Assertions.assertThat;

public class Sudoku2Test {

    @Test
    public void testOne() {
        char[][] sudoku = new char[][]{{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};

        assertThat(sudoku2(sudoku)).isTrue();
    }
}
