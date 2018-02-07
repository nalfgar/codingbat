package warmup_2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringYakTest {

    @Test
    public void testOne(){
        assertEquals("pak",StringYak.stringYak("yakpak"));
    }

    @Test
    public void testTwo(){
        assertEquals("pak",StringYak.stringYak("pakyak"));
    }

    @Test
    public void testThree(){
        assertEquals("123ya",StringYak.stringYak("yak123ya"));
    }
}
