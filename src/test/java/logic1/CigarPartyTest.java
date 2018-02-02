package logic1;

import org.junit.Test;

import static logic1.CigarParty.cigarParty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CigarPartyTest {

    @Test
    public void testOne(){
        assertFalse(cigarParty(30, false));
    }

    @Test
    public void testTwo(){
        assertTrue(cigarParty(50, false));
    }

    @Test
    public void testThree(){
        assertTrue(cigarParty(70, true));
    }
}
