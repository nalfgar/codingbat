package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
    we can see that the 6th prime is 13.
    What is the 10 001st prime number?
     */


public class The10001stPrimeTest {

    @Test
    public void testZero(){
        assertEquals(2, The10001stPrime.the10001stPrime(1));
    }

    @Test
    public void testOne(){
        assertEquals(13, The10001stPrime.the10001stPrime(6));
    }

    @Test
    public void testTwo(){
        assertEquals(17, The10001stPrime.the10001stPrime(7));
    }
}
