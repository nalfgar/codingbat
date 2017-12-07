package warmup_2.stringSplosion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSplosionTest {

    @Test
    public void testZero(){
        assertEquals("", StringSplosion.stringSplosion(""));
    }

    @Test
    public void testOne(){
        assertEquals("a", StringSplosion.stringSplosion("a"));
    }

    @Test
    public void testTwo(){
        assertEquals("aab", StringSplosion.stringSplosion("ab"));
    }

    @Test
    public void testThree(){
        assertEquals("aababc", StringSplosion.stringSplosion("abc"));
    }


}
