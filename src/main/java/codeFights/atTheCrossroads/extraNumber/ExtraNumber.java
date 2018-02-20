package codeFights.atTheCrossroads.extraNumber;

import java.util.HashMap;
import java.util.Map;

public class ExtraNumber {
    public static int extraNumber(int a, int b, int c) {
        Map<Integer, Integer> map = new HashMap<>();

        putIntegerToMap(a, map);
        putIntegerToMap(b, map);
        putIntegerToMap(c, map);

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1){
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }

    private static void putIntegerToMap(int b, Map<Integer, Integer> map) {
        if (!map.containsKey(b)){
            map.put(b,1);
        } else {
            map.put(b, map.get(b) + 1);
        }
    }
}
