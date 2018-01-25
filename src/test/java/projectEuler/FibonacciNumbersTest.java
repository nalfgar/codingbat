package projectEuler;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static projectEuler.FibonacciNumbers.fibonacciEvenNumbers;
import static projectEuler.FibonacciNumbers.fibonacciNumbers;
import static projectEuler.FibonacciNumbers.sumFibonacciEvenNumbers;


public class FibonacciNumbersTest {
    List<BigInteger> expectedList;

    @Before
    public void Setup(){
        expectedList = new ArrayList<>();
        expectedList.add(new BigInteger("1"));
        expectedList.add(new BigInteger("2"));
    }



    @Test
    public void testOne(){
        expectedList.add(new BigInteger("3"));

        assertEquals(expectedList, fibonacciNumbers(3));
    }

    @Test
    public void testTwo(){
        expectedList.add(new BigInteger("3"));
        expectedList.add(new BigInteger("5"));

        assertEquals(expectedList, fibonacciNumbers(4));
    }

    @Test
    public void testThree(){
        expectedList.add(new BigInteger("3"));
        expectedList.add(new BigInteger("5"));
        expectedList.add(new BigInteger("8"));

        assertEquals(expectedList, fibonacciNumbers(5));
    }

    @Test
    public void testFour(){
        expectedList.add(new BigInteger("3"));
        expectedList.add(new BigInteger("5"));
        expectedList.add(new BigInteger("8"));
        expectedList.add(new BigInteger("13"));

        assertEquals(expectedList, fibonacciNumbers(6));
    }

    @Test
    public void testFive() {
        List<BigInteger> expectedEvenList = new ArrayList<>();

        expectedEvenList.add(new BigInteger("2"));
        expectedEvenList.add(new BigInteger("8"));
        expectedEvenList.add(new BigInteger("34"));

        assertEquals(expectedEvenList, fibonacciEvenNumbers(10));
    }

    @Test
    public void testSix() {
        List<BigInteger> expectedEvenList = new ArrayList<>();

        expectedEvenList.add(new BigInteger("2"));
        expectedEvenList.add(new BigInteger("8"));
        expectedEvenList.add(new BigInteger("34"));

        assertEquals(new BigInteger("44"), sumFibonacciEvenNumbers(8));
    }

}
