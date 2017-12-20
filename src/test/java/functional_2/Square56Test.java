package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_2.Square56.square56;
import static org.junit.Assert.assertEquals;

public class Square56Test {

    @Test
    public void testOne(){
        List<Integer> integersList = new ArrayList<>();
        integersList.add(3);
        integersList.add(1);
        integersList.add(4);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(19);
        expectedList.add(11);

        assertEquals(expectedList, square56(integersList));
    }

    @Test
    public void testTwo(){
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(11);

        assertEquals(expectedList, square56(integersList));
    }
}
