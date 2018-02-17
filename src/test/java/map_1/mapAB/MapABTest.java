package map_1.mapAB;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static map_1.mapAB.MapAB.mapAB;
import static org.assertj.core.api.Assertions.assertThat;

public class MapABTest {

    @Test
    public void testOne() {
        Map<String, String> givenMap = new HashMap<>();
        givenMap.put("a", "Hi");
        givenMap.put("b", "There");
        Map<String, String> expectedMap = new HashMap<>();
        givenMap.put("a", "Hi");
        givenMap.put("b", "There");
        givenMap.put("ab", "HiThere");

        assertThat(mapAB(givenMap));
    }

    @Test
    public void testTwo() {
        Map<String, String> givenMap = new HashMap<>();
        givenMap.put("a", "Hi");
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "Hi");


        assertThat(mapAB(givenMap)).isEqualTo(expectedMap);
    }
}
