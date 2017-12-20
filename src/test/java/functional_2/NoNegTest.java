package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_2.NoNeg.noNeg;
import static org.junit.Assert.assertEquals;

public class NoNegTest {

    @Test
    public void testOne(){
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(-2);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);

        assertEquals(expectedList, noNeg(integersList));
    }

    @Test
    public void testTwo(){
        List<Integer> integersList = new ArrayList<>();
        integersList.add(-3);
        integersList.add(-3);
        integersList.add(3);
        integersList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);
        expectedList.add(3);

        assertEquals(expectedList, noNeg(integersList));
    }

    @Test
    public void testThree(){
        List<Integer> integersList = new ArrayList<>();
        integersList.add(-3);
        integersList.add(-3);
        integersList.add(-3);

        List<Integer> expectedList = new ArrayList<>();

        assertEquals(expectedList, noNeg(integersList));
    }


}
