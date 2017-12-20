package codewars.mapBully;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Topping1Test {

    @Test
    public void testOne(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("bread", "butter");
        expectedHashMap.put("ice cream", "cherry");

        HashMap<String, String> inputHashMap = new HashMap<>();
        inputHashMap.put("ice cream", "peanuts");

        assertEquals(expectedHashMap, Topping1.topping1(inputHashMap));
    }

    @Test
    public void testTwo(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("bread", "butter");

        HashMap<String, String> inputHashMap = new HashMap<>();

        assertEquals(expectedHashMap, Topping1.topping1(inputHashMap));
    }


}
