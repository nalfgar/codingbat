package map_1.mapShare;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static map_1.mapShare.MapShare.mapShare;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MapShareTest {

    @Test
    public void testOne() {
        Map<String, String> givenMap = new HashMap<>();
        givenMap.put("a", "aaa");
        givenMap.put("b", "bbb");
        givenMap.put("c", "ccc");
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");
        expectedMap.put("b", "aaa");

        assertThat(mapShare(givenMap)).isEqualTo(expectedMap);
    }


    @Test
    public void testTwo() {
        Map<String, String> givenMap = new HashMap<>();
        givenMap.put("b", "xyx");
        givenMap.put("c", "ccc");
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("b", "xyx");

        assertThat(mapShare(givenMap)).isEqualTo(expectedMap);
    }
}
