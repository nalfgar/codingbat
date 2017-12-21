package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NoLongTest {

    @Test
    public void testOne(){

        List<String> inputList = new ArrayList<>();
        inputList.add("this");
        inputList.add("not");
        inputList.add("too");
        inputList.add("long");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("not");
        expectedList.add("too");

        assertEquals(expectedList, NoLong.noLong(inputList));
    }

    @Test
    public void testTwo(){

        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("bbb");
        inputList.add("cccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bbb");

        assertEquals(expectedList, NoLong.noLong(inputList));
    }
}
