package warmup_1.notString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static warmup_1.notString.NotString.notString;

public class NotStringTest {

    @Test
    public void stringWithoutNotOnStart1(){
        assertEquals("not candy", notString("candy"));
    }

    @Test
    public void stringWithoutNotOnStart2(){
        assertEquals("not x", notString("x"));
    }

    @Test
    public void stringWithNotOnStart(){
        assertEquals("not bad", notString("not bad"));
    }

    @Test
    public void emptyString(){
        assertEquals("not ", notString(""));
    }
}
