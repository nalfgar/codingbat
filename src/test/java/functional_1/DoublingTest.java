package functional_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DoublingTest {
    @Test
    public void testWhenMethodDoublingRecieveEmptyTable(){
        List<Integer> expectedList = new ArrayList<>(0);
        List<Integer> list = new ArrayList<>(0);
        assertTrue(expectedList.equals(Doubling.doubling(list)));
    }

    @Test
    public void testWhenMethodDoublingRecieveNotEmptyTable(){
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);
        expectedList.add(2);
        expectedList.add(4);

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);

        assertTrue(expectedList.equals(Doubling.doubling(list)));
    }

    @Test
    public void testWhenMethodSquareRecieveEmptyTable(){
        List<Integer> expectedList = new ArrayList<>(0);
        List<Integer> list = new ArrayList<>(0);
        assertTrue(expectedList.equals(Doubling.square(list)));
    }

    @Test
    public void testWhenMethodSquareRecieveNotEmptyTable(){
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);
        expectedList.add(100);
        expectedList.add(4);

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(10);
        list.add(2);

        assertTrue(expectedList.equals(Doubling.square(list)));
    }

}
