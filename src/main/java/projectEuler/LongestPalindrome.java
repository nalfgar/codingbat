package projectEuler;

import projectEuler.tools.Palindrome;

import java.util.LinkedList;
import java.util.List;

public class LongestPalindrome {
    public static int longestPalindrome(int n) {
        List<String> list = new LinkedList<>();
        int min = getMin(n);
        int max = getMax(n);
        int longestPalindrome = 0;
        int multiply = 0;

        for (int i = max; i >= min; i--) {
            for (int j = max; j >= min; j--) {
                multiply = i * j;
                if (Palindrome.isPalindromeInt(i * j) && multiply > longestPalindrome){
                    longestPalindrome = multiply;
                }
            }
        }

        return longestPalindrome;
    }

    public static int getMin(int n) {
        int result = 0;
        String string;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            string = String.valueOf(i);
            if (string.length() == n){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int getMax(int n) {
        int result = 0;
        String string;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            string = String.valueOf(i);
            if (string.length() > n){
                result = i;
                break;
            }
        }
        return result - 1;
    }
}
