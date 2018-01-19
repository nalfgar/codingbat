package codility;

import org.junit.Test;

import static codility.CountFactors.countFactors;
import static org.junit.Assert.assertEquals;

public class CountFactorsTest {

    @Test
    public void testTwo(){
        assertEquals(2, countFactors(2));
    }

    @Test
    public void testThree(){
        assertEquals(2, countFactors(3));
    }

    @Test
    public void testFour(){
        assertEquals(2, countFactors(5));
    }
@Test
    public void testFive(){
        assertEquals(2, countFactors(5));
    }


}
