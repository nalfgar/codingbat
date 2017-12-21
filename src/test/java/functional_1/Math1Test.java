package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static functional_1.NoX.noX;
import static org.junit.Assert.assertEquals;

public class Math1Test {

    @Test
    public void testOne(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(20);
        expectedList.add(30);
        expectedList.add(40);

        assertEquals(expectedList, Math1.math1(inputList));
    }

    @Test
    public void testTwo(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(6);
        inputList.add(8);
        inputList.add(6);
        inputList.add(8);
        inputList.add(1);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(70);
        expectedList.add(90);
        expectedList.add(70);
        expectedList.add(90);
        expectedList.add(20);

        assertEquals(expectedList, Math1.math1(inputList));
    }


}
