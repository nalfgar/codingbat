package codewars.variabonacci;

import org.junit.Test;

import static codewars.variabonacci.Tribonacci.tribonnaci;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TribonacciTest {

    private double precision = 1e-10;

    @Test(expected = IllegalArgumentException.class)
    public void whenMethodRecieveWrongData() throws IllegalArgumentException{
        double[] x = new double[]{};
        tribonnaci(x, 10);
    }

    @Test
    public void testOne(){
        assertArrayEquals(new double[]{0,0,0,0,0,0,0,0,0,0}, tribonnaci(new double[]{0, 0, 0}, 10), precision);
    }

    @Test
    public void testTwo(){
        assertArrayEquals(new double[]{0,1,1,2,4,7,13,24,44,81}, tribonnaci(new double[]{0, 1, 1}, 10), precision);
    }

    @Test
    public void testThree(){
        assertArrayEquals(new double[]{1,1,1,3,5,9,17,31,57,105}, tribonnaci(new double[]{ 1, 1, 1}, 10), precision);
    }
}
