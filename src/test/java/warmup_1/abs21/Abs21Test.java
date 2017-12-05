package warmup_1.abs21;

import org.junit.Test;


import static warmup_1.abs21.Abs21.abs21;
import static org.junit.Assert.assertEquals;

public class Abs21Test {

    @Test
    public void test19(){
        assertEquals(2, abs21(19));
    }

    @Test
    public void test10(){
        assertEquals(10, abs21(11));
    }

    @Test
    public void test21(){
        assertEquals(0, abs21(21));
    }

    @Test
    public void test22(){
        assertEquals(1*2, abs21(22));
    }

    @Test
    public void test25(){
        assertEquals(4*2, abs21(25));
    }






}
