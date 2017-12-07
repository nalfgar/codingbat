package warmup_2.stringTimes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTimesTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenSecondParameterIsLessThanZero(){
        StringTimes.stringTimes("", -1);
    }

    @Test
    public void testZero(){
        assertEquals("", StringTimes.stringTimes("Hi", 0));
    }

    @Test
    public void testOne(){
        assertEquals("Hi", StringTimes.stringTimes("Hi", 1));
    }

    @Test
    public void testTwo(){
        assertEquals("HiHi", StringTimes.stringTimes("Hi", 2));
    }

    @Test
    public void testThree(){
        assertEquals("HiHiHi", StringTimes.stringTimes("Hi", 3));
    }

}
