package AP_1;

import org.junit.Test;

import static AP_1.ScoresAverage.scoresAverage;
import static junit.framework.TestCase.assertEquals;

public class ScoresAverageTest {

    @Test
    public void testOne(){
        int[] inputArray = {2, 2, 4, 4};

        assertEquals(4, scoresAverage(inputArray));
    }

    @Test
    public void testTwo(){
        int[] inputArray = {4, 4, 4, 2, 2, 2};

        assertEquals(4, scoresAverage(inputArray));
    }

    @Test
    public void testThree(){
        int[] inputArray = {3, 4, 5, 1, 2, 3};

        assertEquals(4, scoresAverage(inputArray));
    }

    @Test
    public void testFour(){
        int[] inputArray = {11, 11, 11, 2, 2, 2};

        assertEquals(11, scoresAverage(inputArray));
    }
}
