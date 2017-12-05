package warmup_1.parrotTrouble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static warmup_1.parrotTrouble.ParrotTrouble.parrotTrouble;

public class ParrotTroubleTest {

    @Test
    public void returnTrueWhenParrotSpeaksInTheNight(){
        assertEquals(true, parrotTrouble(true, 6));
    }

    @Test
    public void returnFalseWhenParrotSpeaksInTheDay(){
        assertEquals(false, parrotTrouble(true, 7));
    }

    @Test
    public void returnFalseWhenParrotNotSpeaks(){
        assertEquals(false, parrotTrouble(false, 6));
    }

    @Test
    public void returnTrueWhenParrotSpeaksInTheEvening(){
        assertEquals(true, parrotTrouble(true, 22));
    }


}
