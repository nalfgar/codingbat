package string_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutStringTest {

    @Test
    public void testOne(){
        assertEquals( "He there", WithoutString.withoutString("Hello there", "llo"));
    }

    @Test
    public void testTwo(){
        assertEquals( "Hllo thr", WithoutString.withoutString("Hello there", "e"));
    }

    @Test
    public void testThree(){
        assertEquals( "Hello there", WithoutString.withoutString("Hello there", "x"));
    }

    @Test
    public void testFour(){
        assertEquals( "x", WithoutString.withoutString("xxx", "xx"));
    }
    @Test
    public void testFfive(){
        assertEquals( "xzz", WithoutString.withoutString("xyzzy", "Y"));
    }




}
