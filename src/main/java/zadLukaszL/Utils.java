package zadLukaszL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Utils {


    public static boolean isPalindrome(long number) {
        String string = String.valueOf(number);

        int halfStringLength = string.length() / 2;
        for (int i = 0; i < halfStringLength; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static List<Long> getListOfPrimes(long min, long max) throws Exception {
        if (max % 2 == 0) {
            throw new Exception("the max must be odd!!!");
        }

        List<Long> primes = new ArrayList<>();

        for (long i = max; i >= min; i -= 2) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    public static boolean isPrime(long n) {

        return generate(n).size() == 1 ? true : false;
    }

    public static List<Long> generate(long n) {

        List<Long> primes = new LinkedList<Long>();

        for (long candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
