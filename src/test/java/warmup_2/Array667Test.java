package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array667Test {

    @Test
    public void testOne(){
        int[] inputArray = {6, 6, 2};

        assertEquals(1, Array667.array667(inputArray));
    }

    @Test
    public void testTwo(){
        int[] inputArray = {6, 6, 2, 6};

        assertEquals(1, Array667.array667(inputArray));
    }

    @Test
    public void testThree(){
        int[] inputArray = {6, 7, 2, 6};

        assertEquals(1, Array667.array667(inputArray));
    }


}
