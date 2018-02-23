package codeFights.interviewPractice.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsCryptSolutionTest {

    @Test
    public void testOne() {
        String[] crypt = new String[]{"SEND", "MORE", "MONEY"};
        char[][] solution = new char[][]{{'O', '0'}, {'M', '1'}, {'Y', '2'}, {'E', '5'}, {'N', '6'}, {'D', '7'}, {'R', '8'}, {'S', '9'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isTrue();
    }

    @Test
    public void testTwo() {
        String[] crypt = new String[]{"TEN", "TWO", "ONE"};
        char[][] solution = new char[][]{{'O', '1'}, {'T', '0'}, {'W', '9'}, {'E', '5'}, {'N', '4'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isFalse();
    }

    @Test
    public void testThree() {
        String[] crypt = new String[]{"TEN", "TWO", "ONE"};
        char[][] solution = new char[][]{{'O', '2'}, {'T', '4'}, {'W', '6'}, {'E', '6'}, {'N', '3'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isFalse();
    }

    @Test
    public void testFour() {
        String[] crypt = new String[]{"TEN", "ONE", "TWO"};
        char[][] solution = new char[][]{{'O', '0'}, {'T', '1'}, {'W', '2'}, {'E', '5'}, {'N', '6'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isFalse();
    }

    @Test
    public void testFive() {
        String[] crypt = new String[]{"A", "A", "A"};
        char[][] solution = new char[][]{{'A', '0'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isTrue();
    }

    @Test
    public void testSix() {
        String[] crypt = new String[]{"AAAAAAAAAAAA", "BBBBBBBBBBBB", "CCCCCCCCCCCC"};
        char[][] solution = new char[][]{{'A', '1'},{'B','2'},{'C','3'}};

        Assertions.assertThat(IsCryptSolution.isCryptSolution(crypt, solution)).isTrue();
    }
}
