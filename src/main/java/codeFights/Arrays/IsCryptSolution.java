package codeFights.Arrays;

import java.util.HashMap;
import java.util.Map;

public class IsCryptSolution {

    public static boolean isCryptSolution(String[] crypt, char[][] solution) {
        Map<Character, Integer> mapSolution = new HashMap<>();
        for (char[] chars : solution) {
            mapSolution.put(chars[0], Integer.valueOf(String.valueOf(chars[1])));
        }

        return sumarize(crypt[0], mapSolution) + sumarize(crypt[1], mapSolution) == sumarize(crypt[2], mapSolution);
    }

    private static int sumarize(String s, Map<Character, Integer> mapSolution ) {
        String sum = "";

        for (int i = 0; i < s.length(); i++) {
            sum += mapSolution.get(s.charAt(i));
        }
        return Integer.valueOf(sum);
    }
}
