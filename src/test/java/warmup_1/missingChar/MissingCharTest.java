package warmup_1.missingChar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingCharTest {

    @Test
    public void testOne() {
        assertEquals("ktten", MissingChar.missingChar("kitten", 1));
    }

    @Test
    public void testTwo() {
        assertEquals("itten", MissingChar.missingChar("kitten", 0));
    }

    @Test
    public void testThree() {
        assertEquals("kittn", MissingChar.missingChar("kitten", 4));
    }


}
