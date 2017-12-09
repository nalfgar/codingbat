package codewars.nthSeries;

import org.junit.Test;

import static codewars.sumOfTheFirstNthTermOfSeries.NthSeries.nthSeries;
import static org.junit.Assert.assertEquals;

public class NthSeriesTest {
    @Test
    public void ifMethodRecieve0(){
        assertEquals("0.00", nthSeries(0));
    }

    @Test
    public void ifMethodRecieve1(){
        assertEquals("1.00", nthSeries(1));
    }

    @Test
    public void ifMethodRecieve2(){
        assertEquals("1.25", nthSeries(2));
    }

    @Test
    public void ifMethodRecieve5(){
        assertEquals("1.57", nthSeries(5));
    }

    @Test
    public void ifMethodRecieve9(){
        assertEquals("1.77", nthSeries(9));
    }
    @Test
    public void ifMethodRecieve15(){
        assertEquals("1.94", nthSeries(15));
    }
}
