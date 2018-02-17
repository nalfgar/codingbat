package codeFights.exploringTheWaters;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    public static boolean palindromeRearranging(String inputString) {
        Map<String, Integer> map = explodeStringToMap(inputString);

        if (map.size() % 2 == 0 && hasMapOnlyEvenValues(map)) {
            return true;
        } else if (hasMapOnlyOddValueAndEvens(map)){
            return true;
        }
        return false;
    }

    private static Map<String, Integer> explodeStringToMap(String inputString) {
        Map<String, Integer> map = new HashMap<>();
        String letter;
        int numberOfLetter;
        for (int i = 0; i < inputString.length(); i++) {
            letter = String.valueOf(inputString.charAt(i));
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                numberOfLetter = map.get(letter);
                map.put(letter, ++numberOfLetter);
            }

        }
        return map;
    }

    private static boolean hasMapOnlyOddValueAndEvens(Map<String, Integer> map) {
        int oddCounter = 0;

        for (Integer integer : map.values()) {
            if (integer%2 != 0 ){
                oddCounter++;
            }
            if (oddCounter>1){
                return false;
            }
        }

        return true;
    }

    private static boolean hasMapOnlyEvenValues(Map<String, Integer> map) {

        for (Integer integer : map.values()) {
            if (integer % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
