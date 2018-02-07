package warmup_2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static warmup_2.MixStart.mixStart;


public class MixStartTest {

    @Test
    public void testOne(){
        assertTrue(mixStart("mix snacks"));
    }

    @Test
    public void testTwo(){
        assertTrue(mixStart("pix snacks"));
    }

    @Test
    public void testThree(){
        assertFalse(mixStart("piz snacks"));
    }

    @Test
    public void testFour(){
        assertFalse(mixStart("Ala ma kota"));
    }


}
