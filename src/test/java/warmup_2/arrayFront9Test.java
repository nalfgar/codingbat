package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class arrayFront9Test {

    @Test
    public void testOne(){
        int[] inputArray = {1, 2, 9, 3, 4};

        assertEquals(true, ArrayFront9.arrayFront9(inputArray));
    }

    @Test
    public void testTwo(){
        int[] inputArray = {1, 2, 3, 4, 9};

        assertEquals(false, ArrayFront9.arrayFront9(inputArray));
    }

    @Test
    public void testThree(){
        int[] inputArray = {1, 2, 3, 4, 5};

        assertEquals(false, ArrayFront9.arrayFront9(inputArray));
    }

    @Test
    public void testFour(){
        int[] inputArray = {1, 2, 9};

        assertEquals(true, ArrayFront9.arrayFront9(inputArray));
    }
}
