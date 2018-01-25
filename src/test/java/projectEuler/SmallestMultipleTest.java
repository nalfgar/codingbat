package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmallestMultipleTest {

    @Test
    public void testOne(){
        assertEquals(2520, SmallestMultiple.smallestMultiple(10));
    }

    @Test
    public void testTwo(){
        assertEquals(232792560, SmallestMultiple.smallestMultiple(20));
    }
}
