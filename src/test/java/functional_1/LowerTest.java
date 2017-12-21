package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LowerTest {

    @Test
    public void testOne(){
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello");
        inputList.add("Hi");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("hello");
        expectedList.add("hi");

        assertEquals(expectedList, Lower.lower(inputList));
    }

    @Test
    public void testTwo(){
        List<String> inputList = new ArrayList<>();
        inputList.add("AAA");
        inputList.add("BBB");
        inputList.add("ccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("aaa");
        expectedList.add("bbb");
        expectedList.add("ccc");

        assertEquals(expectedList, Lower.lower(inputList));
    }
}
