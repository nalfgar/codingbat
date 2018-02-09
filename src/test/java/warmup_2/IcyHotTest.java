package warmup_2;


import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static warmup_2.IcyHot.icyHot;

public class IcyHotTest {

    @Test
    public void testOne(){
        assertTrue(icyHot(120, -1));
    }

    @Test
    public void testTwo(){
        assertTrue(icyHot(-1, 120));
    }

    @Test
    public void testThree(){
        assertFalse(icyHot(2, 120));
    }

}
