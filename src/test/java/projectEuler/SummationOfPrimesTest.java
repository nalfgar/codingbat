package projectEuler;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class SummationOfPrimesTest {


    @Test
    public void testFive(){
        assertEquals(10, SummationOfPrimes.summationOfPrimes(5));
    }

    @Test
    public void testTen(){
        assertEquals(17, SummationOfPrimes.summationOfPrimes(10));
    }

    @Test
    public void testFiveteen(){
        assertEquals(41, SummationOfPrimes.summationOfPrimes(15));
    }


    @Test
    public void testTwenty(){
        assertEquals(77, SummationOfPrimes.summationOfPrimes(20));
    }
}
