package codeFights.smoothSailing;


import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseParentheses {
    public static String reverseParentheses(String s) {
        Map<Integer, Integer> indexesOfParentheses;
        BeginEndIndexes beginEndIndexes;

        indexesOfParentheses = findParentheses(s);

        while (!indexesOfParentheses.isEmpty()) {
            beginEndIndexes = new BeginEndIndexes(indexesOfParentheses);
            s = deleteParenthesesAndFlipContent(s, beginEndIndexes);
            indexesOfParentheses = findParentheses(s);
        }

        return s;
    }

    private static String deleteParenthesesAndFlipContent(String s, BeginEndIndexes beginEndIndexes) {
        String result = s.substring(0, beginEndIndexes.begin);
        String substring;

        substring = s.substring(beginEndIndexes.begin, beginEndIndexes.end);

        for (int i = substring.length() - 1; i > 0; i--) {
            result += String.valueOf(substring.charAt(i));
        }
        result += s.substring(beginEndIndexes.end + 1);

        return result;
    }

    private static Map<Integer, Integer> findParentheses(String s) {
        Map<Integer, Integer> indexesOfParentheses = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                indexesOfParentheses.put(i, 1);
            }
            if (s.charAt(i) == '(') {
                indexesOfParentheses.put(i, -1);
            }
        }
        return indexesOfParentheses;
    }

    private static class BeginEndIndexes {
        int begin = 0;
        int end = 0;

        public BeginEndIndexes(Map<Integer, Integer> entry) {
            int previousIndex = 0;
            int previousParenthes = 0;
            boolean firstLoop = true;

            for (Map.Entry<Integer, Integer> integerIntegerEntry : entry.entrySet()) {
                if (firstLoop) {
                    previousIndex = integerIntegerEntry.getKey();
                    previousParenthes = integerIntegerEntry.getValue();
                    firstLoop = false;
                } else {
                    if (previousParenthes == -1 && integerIntegerEntry.getValue() == 1) {
                        begin = previousIndex;
                        end = integerIntegerEntry.getKey();
                        break;
                    } else {
                        previousIndex = integerIntegerEntry.getKey();
                        previousParenthes = integerIntegerEntry.getValue();
                    }
                }
            }
        }
    }
}
