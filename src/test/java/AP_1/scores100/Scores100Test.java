package AP_1.scores100;

import org.junit.Test;

import static AP_1.scores100.Scores100.scores100;
import static org.junit.Assert.assertEquals;

public class Scores100Test {

    @Test(expected = Exception.class)
    public void ifArrayLenghtIsLessThan2() throws Exception {
        int[] array = {1};
        scores100(array);
    }

    @Test()
    public void testOne() throws Exception {
        int[] array = {1, 100, 100};
        assertEquals(true, scores100(array));
    }

    @Test()
    public void testTwo() throws Exception {
        int[] array = {1, 100, 99, 100};
        assertEquals(false, scores100(array));
    }

    @Test()
    public void testThree() throws Exception {
        int[] array = {100, 1, 100, 100};
        assertEquals(true, scores100(array));
    }
}
