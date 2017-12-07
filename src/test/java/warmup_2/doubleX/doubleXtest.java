package warmup_2.doubleX;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class doubleXtest {

    @Test
    public void testZero(){
        assertEquals(false, DoubleX.doubleX("axax"));
    }

    @Test
    public void testOne(){
        assertEquals(true, DoubleX.doubleX("axxa"));
    }

    @Test
    public void testTwo(){
        assertEquals(true, DoubleX.doubleX("xxxxxxxx"));
    }
    @Test
    public void testThree(){
        assertEquals(false, DoubleX.doubleX("XxXxXXx"));
    }

    @Test
    public void testFour(){
        assertEquals(false, DoubleX.doubleX(""));
    }







}
