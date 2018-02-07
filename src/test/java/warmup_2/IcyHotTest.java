package warmup_2;


import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class IcyHotTest {

    @Test
    public void testOne(){
        assertTrue(IcyHot.icyHot(120, -1));
    }

    @Test
    public void testTwo(){
        assertTrue(IcyHot.icyHot(-1, 120));
    }

    @Test
    public void testThree(){
        assertFalse(IcyHot.icyHot(2, 120));
    }

}
