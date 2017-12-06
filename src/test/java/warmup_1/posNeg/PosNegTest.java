package warmup_1.posNeg;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static warmup_1.posNeg.PosNeg.posNeg;


public class PosNegTest {

    @Test
    public void ifFirstIsNegativeSecondIsPositiveNegativeIsFalse(){
        assertEquals(true, posNeg(1, -1, false));
    }

    @Test
    public void ifSecondIsNegativeFirstIsPositiveNegativeIsFalse(){
        assertEquals(true, posNeg(-1, 1, false));
    }

    @Test
    public void bothAreNegativeNegativeIsTrue(){
        assertEquals(true, posNeg(-1, -1, true));
    }

    @Test
    public void ifFirstIsNegativeSecondIsPositiveNegativeIsTrue(){
        assertEquals(false, posNeg(1, -1, true));
    }

    @Test
    public void ifFirstIsPositiveSecondIsNegativeNegativeIsTrue(){
        assertEquals(false, posNeg(-1, 1, true));
    }




}
