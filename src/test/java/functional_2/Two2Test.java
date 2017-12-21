package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Two2Test {

    @Test
    public void testOne() {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(6);

        assertEquals(expectedList, Two2.two2(integersList));
    }

    @Test
    public void testTwo() {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(2);
        integersList.add(6);
        integersList.add(11);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);

        assertEquals(expectedList, Two2.two2(integersList));
    }


}
