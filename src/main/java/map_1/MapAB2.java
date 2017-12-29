package map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static Map<String, String> mapAB2(Map<String, String> map) {
        Map<String, String> resultMap = new HashMap<>();

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equals("a")) {
                    ;
                } else if (entry.getKey().equals("b")) {
                    ;
                } else {
                    resultMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }

        return resultMap;
    }
}

