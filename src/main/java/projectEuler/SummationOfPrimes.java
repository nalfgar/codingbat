package projectEuler;

import projectEuler.tools.Palindrome;

import static projectEuler.tools.Primes.generatePrimes;

public class SummationOfPrimes {
    public static long summationOfPrimes(int N) {
        long sum = 2;

        for (int i = 3; i <= N; i += 2) {
            if (generatePrimes(i).size() == 1){
                sum += i;
            }
        }

        return sum;
    }
}
