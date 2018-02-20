package codeFights.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {
    public static char firstNotRepeatingCharacter(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String letter;

        stringToMap(s, map);

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 1) {
                return stringIntegerEntry.getKey().charAt(0);
            }
        }
        return '_';

    }

    public static void stringToMap(String s, Map<String, Integer> map) {
        String letter;
        for (int i = 0; i < s.length(); i++) {
            letter = String.valueOf(s.charAt(i));
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter) + 1);
            }
        }
    }
}
