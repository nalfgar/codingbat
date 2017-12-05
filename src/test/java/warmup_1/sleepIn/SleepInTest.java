package warmup_1.sleepIn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static warmup_1.sleepIn.SleepIn.sleepIn;

public class SleepInTest {

    @Test
    public void returnsFalseWhenBothAreFalse(){
        assertEquals(true, sleepIn(false, false));
    }

    @Test
    public void returnFalseWhenVacationIsFalse(){
        assertEquals(false, sleepIn(true, false));
    }

    @Test
    public void returnTrueWhenVacationIsTrue(){
        assertEquals(true, sleepIn(false, true));
    }
}
