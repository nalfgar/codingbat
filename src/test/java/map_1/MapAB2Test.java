package map_1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class MapAB2Test {

    @Test
    public void testOne(){
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "aaa");
        inputMap.put("c", "cake");

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("c", "cake");

        assertEquals(expectedMap, MapAB2.mapAB2(inputMap));
    }

    @Test
    public void testTwo(){
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "bbb");

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");
        expectedMap.put("b", "bbb");

        assertEquals(expectedMap, MapAB2.mapAB2(inputMap));
    }

    @Test
    public void testThree(){
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "aaa");
        inputMap.put("b", "bbb");
        inputMap.put("c", "aaa");

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");
        expectedMap.put("b", "bbb");
        expectedMap.put("c", "aaa");

        assertEquals(expectedMap, MapAB2.mapAB2(inputMap));
    }
}
