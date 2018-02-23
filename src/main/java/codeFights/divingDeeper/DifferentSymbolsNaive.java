package codeFights.divingDeeper;

import java.util.HashMap;
import java.util.Map;

public class DifferentSymbolsNaive {
    public static int differentSymbolsNaive(String s) {
        Map<Character, Boolean> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, true);
        }

        return map.size();
    }
}
