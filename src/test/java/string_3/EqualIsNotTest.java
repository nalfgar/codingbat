package string_3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static string_3.EqualIsNot.equalIsNot;

public class EqualIsNotTest {

    @Test
    public void testOne(){
        assertFalse(equalIsNot("This is not"));
    }

    @Test
    public void testTwo(){
        assertTrue(equalIsNot("This is notnot"));
    }


}
