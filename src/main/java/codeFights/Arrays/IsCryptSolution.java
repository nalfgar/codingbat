package codeFights.Arrays;

import java.util.HashMap;
import java.util.Map;

public class IsCryptSolution {

    public static boolean isCryptSolution(String[] crypt, char[][] solution) {
        Map<Character, Integer> mapSolution = new HashMap<>();
        for (char[] chars : solution) {
            mapSolution.put(chars[0], Integer.valueOf(String.valueOf(chars[1])));
        }
        String first = sumarize(crypt[0], mapSolution);
        String second = sumarize(crypt[1], mapSolution);
        String sum = sumarize(crypt[2], mapSolution);

        if (Long.valueOf(first) + Long.valueOf(second) == Long.valueOf(sum)) {
            if (Long.valueOf(first).toString().length() == crypt[0].length()) {
                if (Long.valueOf(second).toString().length() == crypt[1].length()) {
                    if (Long.valueOf(sum).toString().length() == crypt[2].length()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String sumarize(String s, Map<Character, Integer> mapSolution) {
        String sum = "";

        for (int i = 0; i < s.length(); i++) {
            sum += mapSolution.get(s.charAt(i));
        }
        return sum;
    }
}
