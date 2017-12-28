package AP_1;

import org.junit.Test;

import static AP_1.MergeTwo.mergeTwo;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class MergeTwoTest {

    @Test
    public void testOne(){
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};

        String[] expectedList = {"a", "b", "c"};

        assertArrayEquals(expectedList, mergeTwo(a, b, 3));

    }

    @Test
    public void testTwo(){
        String[] a = {"a", "c", "z"};
        String[] b = {"c", "f", "z"};

        String[] expectedList = {"a", "c", "f"};

        assertArrayEquals(expectedList, mergeTwo(a, b, 3));

    }

    @Test
    public void testThree(){
        String[] a = {"f", "g", "z"};
        String[] b = {"c", "f", "g"};

        String[] expectedList = {"c", "f", "g"};

        assertArrayEquals(expectedList, mergeTwo(a, b, 3));

    }

    @Test
    public void testFour(){
        String[] a = {"a", "b", "c", "z"};
        String[] b = {"a", "c", "z"};

        String[] expectedList = {"a", "b", "c"};

        assertArrayEquals(expectedList, mergeTwo(a, b, 3));

    }
}
