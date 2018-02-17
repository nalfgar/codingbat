package codeFights.smoothSailing;

import java.util.LinkedList;
import java.util.List;

public class AllLongestStrings {
    public static String[] allLongestStrings(String[] inputArray) {
        int maxLenght = 0;
        List<String> listMax = new LinkedList<>();
        String[] result;

        for (String s : inputArray) {
            if (s.length() > maxLenght) {
                maxLenght = s.length();
            }
        }

        for (String s : inputArray) {
            if (s.length() == maxLenght) {
                listMax.add(s);
            }
        }
        result = new String[listMax.size()];
        for (int i = 0; i < listMax.size(); i++) {
            result[i] = listMax.get(i);
        }

        return result;
    }
}
