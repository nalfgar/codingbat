package projectEuler;

import projectEuler.tools.Palindrome;

import static projectEuler.tools.Primes.generatePrimes;

public class The10001stPrime {
    public static int the10001stPrime(int number) {
        int i = 0;
        int countPrime = 0;

        while (countPrime < number) {
            if (generatePrimes(i).size() == 1) {
                countPrime++;
            }
            i++;
        }
        return i-1;
    }
}
