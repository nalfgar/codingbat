package codeFights.strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AmendTheSentence {
    public static String amendTheSentence(String s) {
        if (s.length() == 0) return s;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 65; i < 91; i++) {
            map.put((char) i, 1);
        }
        List<String> result = new LinkedList<>();

        char letter;
        for (int i = 0; i < s.length(); i++) {


        }


        return result.toString();
    }
}
