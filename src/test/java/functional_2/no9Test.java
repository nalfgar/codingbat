package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class no9Test {

    @Test
    public void testOne() {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(19);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);

        assertEquals(expectedList, No9.no9(integersList));
    }

    @Test
    public void testTwo() {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(9);
        integersList.add(19);
        integersList.add(29);
        integersList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);

        assertEquals(expectedList, No9.no9(integersList));
    }
}
