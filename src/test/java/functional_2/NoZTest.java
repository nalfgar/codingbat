package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NoZTest {
    @Test
    public void testOne(){

        List<String> inputList = new ArrayList<>();
        inputList.add("aaa");
        inputList.add("bbb");
        inputList.add("aza");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("aaa");
        expectedList.add("bbb");

        assertEquals(expectedList, NoZ.noZ(inputList));
    }
}
