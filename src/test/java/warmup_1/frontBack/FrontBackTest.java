package warmup_1.frontBack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontBackTest {

    @Test
    public void emptyString(){
        assertEquals("", FrontBack.frontBack(""));
    }

    @Test
    public void testOne(){
        assertEquals("eodc", FrontBack.frontBack("code"));
    }

    @Test
    public void testTwo(){
        assertEquals("a", FrontBack.frontBack("a"));
    }


}
