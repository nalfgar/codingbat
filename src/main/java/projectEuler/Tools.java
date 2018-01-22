package projectEuler;

import java.util.LinkedList;
import java.util.List;

public class Tools {

    public static List<Integer> generatePrimes(Integer n) {

        List<Integer> primes = new LinkedList<Integer>();

        for (int candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }


    public static boolean isDoubleBasePalindrome(int number) {

        return isPalindromeInt(number) && isDoubleBasePalindrome(Integer.toBinaryString(number));
    }

    private static boolean isDoubleBasePalindrome(String string) {

        for (int j = 0; j < (string.length() / 2); j++) {
            if (string.charAt(j) != string.charAt(string.length() -1 - j)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromeInt(int number){
        String numberString = String.valueOf(number);

        return isDoubleBasePalindrome(numberString);
    }
}