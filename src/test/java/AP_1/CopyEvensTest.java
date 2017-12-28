package AP_1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CopyEvensTest {

    @Test
    public void testOne(){
        int[] inputList = {3, 2, 4, 5, 8};
        int[] expectedList = {2, 4};

        assertArrayEquals(expectedList, CopyEvens.copyEvens(inputList, 2));
    }

    @Test
    public void testTwo(){
        int[] inputList = {3, 2, 4, 5, 8};
        int[] expectedList = {2, 4, 8};

        assertArrayEquals(expectedList, CopyEvens.copyEvens(inputList, 3));
    }
}
