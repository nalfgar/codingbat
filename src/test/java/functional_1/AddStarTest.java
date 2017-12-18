package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class AddStarTest {

    @Test
    public void testOne() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("*");
        List<String> list = new ArrayList<>();
        list.add("");

        assertTrue(expectedList.equals(AddStar.addStar(list)));
    }
}
