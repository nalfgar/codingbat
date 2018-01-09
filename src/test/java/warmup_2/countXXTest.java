package warmup_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class countXXTest {

    @Test
    public void testOne(){

        assertEquals(1, CountXX.countXX("abcxx"));
    }

    @Test
    public void testTwo(){

        assertEquals(2, CountXX.countXX("xxx"));
    }

    @Test
    public void testThree(){

        assertEquals(3, CountXX.countXX("xxxx"));
    }

    @Test
    public void testFive(){

        assertEquals(0, CountXX.countXX("Hello there"));
    }
}
