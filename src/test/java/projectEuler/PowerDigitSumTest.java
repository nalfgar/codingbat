package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PowerDigitSumTest {

    @Test
    public void testOne(){
        assertEquals(4, PowerDigitSum.PowerDigitSum(2));
    }

    @Test
    public void testTwo(){
        assertEquals(7, PowerDigitSum.PowerDigitSum(10));
    }

}
