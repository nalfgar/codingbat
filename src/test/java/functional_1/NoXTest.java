package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_1.NoX.noX;
import static org.junit.Assert.assertEquals;

public class NoXTest {

    @Test
    public void testOne(){
        List<String> inputList = new ArrayList<>();
        inputList.add("ax");
        inputList.add("bb");
        inputList.add("cx");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");
        expectedList.add("c");

        assertEquals(expectedList, noX(inputList));
    }

    @Test
    public void testTwo(){
        List<String> inputList = new ArrayList<>();
        inputList.add("xaxx");
        inputList.add("xbxbx");
        inputList.add("xxcx");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");
        expectedList.add("c");

        assertEquals(expectedList, noX(inputList));
    }
}
