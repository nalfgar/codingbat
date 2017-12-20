package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_2.Square56.square56;
import static org.junit.Assert.assertEquals;

public class No34Test {

    @Test
    public void testOne(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("bb");
        stringList.add("ccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");

        assertEquals(expectedList, No34.no34(stringList));

    }

    @Test
    public void testTwo(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("bb");
        stringList.add("ccc");
        stringList.add("dddd");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");

        assertEquals(expectedList, No34.no34(stringList));

    }@Test
    public void testThree(){
        List<String> stringList = new ArrayList<>();
        stringList.add("ccc");
        stringList.add("dddd");
        stringList.add("apple");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("apple");

        assertEquals(expectedList, No34.no34(stringList));
    }
}
