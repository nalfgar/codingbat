package functional_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_2.NoTeen.noTeen;
import static junit.framework.TestCase.assertEquals;

public class NoTeenTest {

    @Test
    public void testOne(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(12);
        inputList.add(13);
        inputList.add(19);
        inputList.add(20);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(12);
        expectedList.add(20);

        assertEquals(expectedList, noTeen(inputList));
    }


    @Test
    public void testTwo(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(14);
        inputList.add(1);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(1);

        assertEquals(expectedList, noTeen(inputList));
    }

    @Test
    public void testThree(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(15);
        List<Integer> expectedList = new ArrayList<>();

        assertEquals(expectedList, noTeen(inputList));
    }
}
