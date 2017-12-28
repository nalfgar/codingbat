package AP_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static AP_1.WordsWithoutList.wordsWithoutList;
import static junit.framework.TestCase.assertEquals;

public class WordsWithoutListTest {

    @Test
    public void testOne(){
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("bb");
        inputList.add("b");
        inputList.add("ccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("bb");
        expectedList.add("ccc");

        assertEquals(expectedList, wordsWithoutList(inputList, 1));
    }

    @Test
    public void testTwo(){
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("bb");
        inputList.add("b");
        inputList.add("ccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");
        expectedList.add("b");

        assertEquals(expectedList, wordsWithoutList(inputList, 3));
    }

    @Test
    public void testThree(){
        List<String> inputList = new ArrayList<>();
        inputList.add("a");
        inputList.add("bb");
        inputList.add("b");
        inputList.add("ccc");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("bb");
        expectedList.add("b");
        expectedList.add("ccc");

        assertEquals(expectedList, wordsWithoutList(inputList, 4));
    }
}
