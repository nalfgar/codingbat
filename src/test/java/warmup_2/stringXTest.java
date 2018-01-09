package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class stringXTest {

    @Test
    public void testOne(){
        String string = "xxHxix";
        String expectedString = "xHix";
        assertEquals(expectedString, StringX.stringX(string));
    }

    @Test
    public void testTwo(){
        String string = "abxxxcd";
        String expectedString = "abcd";
        assertEquals(expectedString, StringX.stringX(string));
    }

    @Test
    public void testThree(){
        String string = "xabxxxcdx";
        String expectedString = "xabcdx";
        assertEquals(expectedString, StringX.stringX(string));
    }
}
