package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static warmup_2.DoubleX.doubleX;

public class doubleXtest {

    @Test
    public void testZero(){
        assertEquals(true, doubleX("axxbb"));
    }

    @Test
    public void testOne(){
        assertEquals(true, doubleX("xxxxx"));
    }

    @Test
    public void testTwo(){
        assertEquals(true, doubleX("xx"));
    }

    @Test
    public void testThree(){
        assertEquals(false, doubleX("xaxxx"));
    }

    @Test
    public void testFour(){
        assertEquals(false, doubleX("axaxax"));
    }

    @Test
    public void testFive(){
        assertEquals(false, doubleX("aaaax"));
    }

    @Test
    public void testSix(){
        assertEquals(false, doubleX(""));
    }

    @Test
    public void testSeven(){
        assertEquals(false, doubleX("abc"));
    }

    @Test
    public void testEight(){
        assertEquals(false, doubleX("x"));
    }
}
