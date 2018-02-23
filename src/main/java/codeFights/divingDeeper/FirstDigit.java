package codeFights.divingDeeper;

import java.util.HashMap;
import java.util.Map;

public class FirstDigit {
    public static char firstDigit(String inputString) {
        Map<Character, Boolean> map = new HashMap<>();
        map.put('0',true);
        map.put('1',true);
        map.put('2',true);
        map.put('3',true);
        map.put('4',true);
        map.put('5',true);
        map.put('6',true);
        map.put('7',true);
        map.put('8',true);
        map.put('9',true);

        for (int i = 0; i < inputString.length(); i++) {
            if (map.containsKey(inputString.charAt(i))){
                return inputString.charAt(i);
            }
        }

        return '.';
    }
}