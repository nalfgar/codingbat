package zadLukaszL;

import java.util.ArrayList;
import java.util.List;

import static zadLukaszL.Utils.getListOfPrimes;
import static zadLukaszL.Utils.isPalindrome;

public class Main {
    private static final int MIN = 10001; //the MIN must be odd!!!
    private static final int MAX = 99999;

    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        List<Integer> primes = null;
        try {
            primes = getListOfPrimes(MIN, MAX);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int maxPalindrome = 0;

        int multi;
        for (Integer prime1 : primes) {
            for (Integer prime2 : primes) {
                multi = prime1 * prime2;
                if (multi > maxPalindrome && isPalindrome(multi)) {
                    maxPalindrome = multi;
                }
            }
        }
        System.out.println(maxPalindrome);
        long stop=System.currentTimeMillis();
        System.out.println("Czas wykonania:"+(stop-start)/1000 + "[s]");
    }


}
