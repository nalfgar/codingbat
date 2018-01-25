package zadLukaszL;

import java.util.List;

import static projectEuler.tools.Primes.generatePrimes;
import static zadLukaszL.Utils.getListOfPrimes;
import static zadLukaszL.Utils.isPalindrome;

public class Main {
    private static final long MIN = 10000;
    private static final long MAX = 99999; //the MAX must be odd!!!

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        System.out.println(generatePrimes(24));
//        System.out.println(findMaxPalindrome());

        long stop=System.currentTimeMillis();
        System.out.println("Time of work:"+(stop-start)/1000.0 + "[s]");
    }

    public static long findMaxPalindrome(){
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

        return maxPalindrome;
    }
}
