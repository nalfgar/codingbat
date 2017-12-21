package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NoYYTest {

    @Test
    public void testOne(){
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("b");
        inputList.add("c");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ay");
        expectedList.add("by");
        expectedList.add("cy");

        assertEquals(expectedList, NoYY.noYY(inputList));
    }

    @Test
    public void testTwo(){
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("b");
        inputList.add("cy");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ay");
        expectedList.add("by");

        assertEquals(expectedList, NoYY.noYY(inputList));
    }

    @Test
    public void testThree(){
        List<String> inputList = new ArrayList<>();
        inputList.add("yyx");
        inputList.add("y");
        inputList.add("zzz");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("zzzy");

        assertEquals(expectedList, NoYY.noYY(inputList));
    }
}
