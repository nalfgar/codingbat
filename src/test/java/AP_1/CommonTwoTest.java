package AP_1;

import org.junit.Test;

import static AP_1.CommonTwo.commonTwo;
import static junit.framework.TestCase.assertEquals;

public class CommonTwoTest {

    @Test
    public void testOne(){
        String[] a = {"a", "c", "x"};
        String[] b = {"b", "c", "d", "x"};

        assertEquals(2, commonTwo(a, b));
    }

    @Test
    public void testTwo(){
        String[] a = {"a", "c", "x"};
        String[] b = {"a", "b", "c", "x", "z"};

        assertEquals(3, commonTwo(a, b));
    }

    @Test
    public void testThree(){
        String[] a = {"a", "c", "x"};
        String[] b = {"a", "c", "x"};

        assertEquals(3, commonTwo(a, b));
    }
}
