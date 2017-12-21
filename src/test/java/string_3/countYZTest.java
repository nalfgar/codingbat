package string_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class countYZTest {

    @Test
    public void testOne(){
        assertEquals(2, CountYZ.countYZ("fez day"));
    }

    @Test
    public void testTwo(){
        assertEquals(2, CountYZ.countYZ("day fez"));
    }

    @Test
    public void testThre(){
        assertEquals(2, CountYZ.countYZ("day fyyyz"));
    }
}
