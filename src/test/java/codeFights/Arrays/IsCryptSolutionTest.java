package codeFights.Arrays;

import org.junit.Test;

import static codeFights.Arrays.IsCryptSolution.isCryptSolution;
import static org.assertj.core.api.Assertions.assertThat;

public class IsCryptSolutionTest {

    @Test
    public void testOne() {
        String[] crypt = new String[]{"SEND", "MORE", "MONEY"};
        char[][] solution = new char[][]{{'O', '0'}, {'M', '1'}, {'Y', '2'}, {'E', '5'}, {'N', '6'}, {'D', '7'}, {'R', '8'}, {'S', '9'}};

        assertThat(isCryptSolution(crypt, solution)).isTrue();
    }

    @Test
    public void testTwo() {
        String[] crypt = new String[]{"TEN", "TWO", "ONE"};
        char[][] solution = new char[][]{{'O', '1'}, {'T', '0'}, {'W', '9'}, {'E', '5'}, {'N', '4'}};

        assertThat(isCryptSolution(crypt, solution)).isFalse();
    }
}
