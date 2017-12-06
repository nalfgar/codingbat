package warmup_1.front3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Front3Test {
    @Test
    public void emptyString(){
        assertEquals("", Front3.front3(""));
    }

    @Test
    public void stringHasLessThan3Chars(){
        assertEquals("aaa", Front3.front3("a"));
    }

    @Test
    public void stringHasMoreThan3Chars(){
        assertEquals("JavJavJav", Front3.front3("Java"));
    }


}
