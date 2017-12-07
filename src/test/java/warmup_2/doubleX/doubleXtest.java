package warmup_2.doubleX;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class doubleXtest {

    @Test
    public void testZero(){
        assertEquals(true, DoubleX.doubleX("axxbb"));
    }

    @Test
    public void testOne(){
        assertEquals(true, DoubleX.doubleX("xxxxx"));
    }

    @Test
    public void testTwo(){
        assertEquals(true, DoubleX.doubleX("xx"));
    }

    @Test
    public void testThree(){
        assertEquals(false, DoubleX.doubleX("xaxxx"));
    }

    @Test
    public void testFour(){
        assertEquals(false, DoubleX.doubleX("axaxax"));
    }

    @Test
    public void testFive(){
        assertEquals(false, DoubleX.doubleX("aaaax"));
    }

    @Test
    public void testSix(){
        assertEquals(false, DoubleX.doubleX(""));
    }

    @Test
    public void testSeven(){
        assertEquals(false, DoubleX.doubleX("abc"));
    }

    @Test
    public void testEight(){
        assertEquals(false, DoubleX.doubleX("x"));
    }
}
