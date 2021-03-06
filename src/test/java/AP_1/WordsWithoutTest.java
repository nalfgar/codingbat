package AP_1;

import org.junit.Test;

import static AP_1.WordsWithout.wordsWithout;
import static org.junit.Assert.assertArrayEquals;

public class WordsWithoutTest {

    @Test(expected = Exception.class)
    public void whenMethodsRecivesEmptyArray() throws Exception{
        String[] array = {};
        wordsWithout(array, "a");
    }

    @Test(expected = Exception.class)
    public void whenMethodsRecivesEmptyString() throws Exception{
        String[] array = {"a", "b", "c"};
        wordsWithout(array, "");
    }

    @Test
    public void whenMethodsRecivesValidData1() throws Exception{
        String[] array = {"a", "b", "c"};
        String str = "a";
        String[] arrayExpected = {"b", "c"};
        assertArrayEquals(arrayExpected, wordsWithout(array, str));
    }


    @Test
    public void whenMethodsRecivesValidData2() throws Exception {
        String[] array = {"a", "a", "c"};
        String str = "a";
        String[] arrayExpected = {"c"};
        assertArrayEquals(arrayExpected, wordsWithout(array, str));
    }
}
