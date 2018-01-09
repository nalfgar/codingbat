package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static warmup_2.Array123.array123;

public class array123Test {

    @Test(expected = Exception.class)
    public void testZero() throws Exception {
        int[] array = {1, 2};
        array123(array);
    }

    @Test
    public void testOne() throws Exception {
        int[] array = {1, 1, 1};
        assertEquals(false, array123(array));
    }

    @Test
    public void testTwo() throws Exception {
        int[] array = {1, 2, 3};
        assertEquals(true, array123(array));
    }

    @Test
    public void testThree() throws Exception {
        int[] array = {0, 7, 10, 1, 2, 3};
        assertEquals(true, array123(array));
    }

    @Test
    public void testFour() throws Exception {
        int[] array = {1, 1, 2, 4, 1};
        assertEquals(false, array123(array));
    }


}
