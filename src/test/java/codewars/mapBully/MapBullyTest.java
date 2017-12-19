package codewars.mapBully;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MapBullyTest {

    @Test
    public void testOne(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("a", "");
        expectedHashMap.put("b", "candy");

        HashMap<String, String> inputHashMap = new HashMap<>();
        inputHashMap.put("a", "candy");
        inputHashMap.put("b", "dirt");

        assertEquals(expectedHashMap, MapBully.mapBully(inputHashMap));
    }
    @Test
    public void testTwo(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("a", "");
        expectedHashMap.put("b", "candy");

        HashMap<String, String> inputHashMap = new HashMap<>();
        inputHashMap.put("a", "candy");

        assertEquals(expectedHashMap, MapBully.mapBully(inputHashMap));
    }

    @Test
    public void testThree(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("a", "");
        expectedHashMap.put("b", "candy");
        expectedHashMap.put("c", "mech");

        HashMap<String, String> inputHashMap = new HashMap<>();
        inputHashMap.put("a", "candy");
        inputHashMap.put("b", "carrot");
        inputHashMap.put("c", "mech");

        assertEquals(expectedHashMap, MapBully.mapBully(inputHashMap));
    }
    @Test
    public void testFour(){
        HashMap<String, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put("b", "carrot");

        HashMap<String, String> inputHashMap = new HashMap<>();
        inputHashMap.put("b", "carrot");

        assertEquals(expectedHashMap, MapBully.mapBully(inputHashMap));
    }


}
