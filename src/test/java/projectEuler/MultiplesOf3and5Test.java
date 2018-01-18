package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5,
        we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below 1000.
    */


public class MultiplesOf3and5Test {
    @Test
    public void testOne(){
        assertEquals(23, MultiplesOf3and5.multiplesOf3and5(10));
    }

    @Test
    public void testTwo(){
        assertEquals(45, MultiplesOf3and5.multiplesOf3and5(15));
    }

    @Test
    public void testThousnad(){
        assertEquals(233168, MultiplesOf3and5.multiplesOf3and5(1000));
    }


}
