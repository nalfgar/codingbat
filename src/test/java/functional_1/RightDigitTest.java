package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RightDigitTest {

    @Test
    public void testOne(){

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(22);
        inputList.add(93);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        assertEquals(expectedList, RightDigit.rightDigit(inputList));
    }

    @Test
    public void testTwo(){

        List<Integer> inputList = new ArrayList<>();
        inputList.add(16);
        inputList.add(8);
        inputList.add(886);
        inputList.add(8);
        inputList.add(1);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(1);
        assertEquals(expectedList, RightDigit.rightDigit(inputList));
    }

    @Test
    public void testThree(){

        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(0);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(0);
        expectedList.add(0);
        assertEquals(expectedList, RightDigit.rightDigit(inputList));
    }
}
