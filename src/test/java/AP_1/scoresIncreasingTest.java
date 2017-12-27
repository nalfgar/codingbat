package AP_1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class scoresIncreasingTest {

    @Test
    public void testOne() {
        int[] input = {1, 3, 4};

        assertEquals(true, ScoresIncreasing.scoresIncreasing(input));
    }

    @Test
    public void testTwo() {
        int[] input = {1, 3, 2};

        assertEquals(false, ScoresIncreasing.scoresIncreasing(input));
    }

    @Test
    public void testThree() {
        int[] input = {1, 1, 4};

        assertEquals(true, ScoresIncreasing.scoresIncreasing(input));
    }
}
