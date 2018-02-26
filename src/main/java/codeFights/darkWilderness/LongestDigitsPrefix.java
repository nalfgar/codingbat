package codeFights.darkWilderness;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongestDigitsPrefix {
    public static String longestDigitsPrefix(String inputString) {
        List<Character> digits = new ArrayList<>();
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (isDigit(inputString.charAt(i))){
                digits.add(inputString.charAt(i));
            } else{
                break;
            }
        }
        for (Character digit : digits) {
            result += String.valueOf(digit);
        }
        return result;
    }

    private static boolean isDigit(char c) {
        List<Character> digits = new LinkedList<>();
        digits.add('1');
        digits.add('2');
        digits.add('3');
        digits.add('4');
        digits.add('5');
        digits.add('6');
        digits.add('7');
        digits.add('8');
        digits.add('9');
        digits.add('0');

        return digits.contains(c);
    }
}
