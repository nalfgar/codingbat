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
}