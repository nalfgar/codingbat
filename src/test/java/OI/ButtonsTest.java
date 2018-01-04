package OI;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ButtonsTest {

    @Test
    public void testOne(){
        int[] inputTable = {3, 4, 4, 6, 1, 4, 4};
        int[] expectedTable = {3, 2, 2, 4, 2};

        assertArrayEquals(expectedTable, Buttons.buttons(5, 7, inputTable));
    }

    @Test
    public void testTwo(){
        int[] inputTable = {1, 1, 1, 8, 1, 1, 1, 8, 2, 7};
        int[] expectedTable = {6, 7, 6, 6, 6, 6, 7};

        assertArrayEquals(expectedTable, Buttons.buttons(7, 10, inputTable));
    }
}
