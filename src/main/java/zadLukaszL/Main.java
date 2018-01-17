package zadLukaszL;

import java.util.ArrayList;
import java.util.List;

import static zadLukaszL.Utils.getListOfPrimes;
import static zadLukaszL.Utils.isPalindrome;

public class Main {
    private static final long MIN = 10001;
    private static final long MAX = 99999;//the MAX must be odd!!!

    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        List<Long> primes = null;
        try {
            primes = getListOfPrimes(MIN, MAX);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long maxPalindrome = 0;

        long multi;
        for (Long prime1 : primes) {
            for (Long prime2 : primes) {
                multi = prime1 * prime2;
                if (multi > maxPalindrome && isPalindrome(multi)) {
                    maxPalindrome = multi;
                }
            }
        }

        System.out.println(maxPalindrome);
        long stop=System.currentTimeMillis();
        System.out.println("Time of work:"+(stop-start)/1000 + "[s]");
    }


}
