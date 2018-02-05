package string_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static string_3.CountYZ.countYZ;

public class CountYZTest {

    @Test
    public void testOne(){
        assertEquals(2, countYZ("fez day"));
    }

    @Test
    public void testTwo(){
        assertEquals(2, countYZ("day fez"));
    }

    @Test
    public void testThre(){
        assertEquals(2, countYZ("day fyyyz"));
    }
}
