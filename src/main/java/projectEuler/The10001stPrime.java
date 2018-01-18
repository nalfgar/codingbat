package projectEuler;

import java.util.List;

public class The10001stPrime {
    public static int the10001stPrime(int number) {
        int i = 0;
        int countPrime = 0;

        while (countPrime < number) {
            if (Tools.generatePrimes(i).size() == 1) {
                countPrime++;
            }
            i++;
        }
        return i-1;
    }
}
