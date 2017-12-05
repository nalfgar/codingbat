package warmup_1.monkeyTrouble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkeyTroubleTest {
    @Test
    public void bothSmiling(){
        assertEquals(true, MonkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void bothNotSmiling(){
        assertEquals(true, MonkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void oneNotSmiling(){
        assertEquals(false, MonkeyTrouble.monkeyTrouble(true, false));
    }


}
