package zadLukaszL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Utils {


    public static boolean isPalindrome(int number) {
        String string = String.valueOf(number);

        int halfStringLength = string.length() / 2;
        for (int i = 0; i < halfStringLength; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getListOfPrimes(int min, int max) throws Exception {
        if (min%2==0) {
            throw new Exception("the MIN must be odd!!!");
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = min; i <= max; i += 2) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    public static boolean isPrime(int n) {

        return generate(n).size() == 1 ? true : false;
    }

    public static List<Integer> generate(int n) {

        List<Integer> primes = new LinkedList<Integer>();

        for (int candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
