package codeFights.smoothSailing;

import codeFights.Arrays.FirstNotRepeatingCharacter;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {
    public static int commonCharacterCount(String s1, String s2) {
        int counter = 0;
        Map<String, Integer> map = new HashMap<>();
        String letter1;

        fillMap(s2, map);

        return analizeData(s1, counter, map);
    }

    private static int analizeData(String s1, int counter, Map<String, Integer> map) {
        String letter1;
        for (int i = 0; i < s1.length(); i++) {
            letter1 = String.valueOf(s1.charAt(i));
            if (map.containsKey(letter1) && map.get(letter1) > 0){
                counter++;
                map.put(letter1, map.get(letter1)-1);
            }
        }
        return counter;
    }

    private static void fillMap(String s2, Map<String, Integer> map) {
        String letter1;
        FirstNotRepeatingCharacter.stringToMap(s2, map);
    }
}
