package projectEuler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class SummationOfPrimes {
    public static long summationOfPrimes(int N) {
        long sum = 2;

        for (int i = 3; i <= N; i += 2) {
            if (Tools.generatePrimes(i).size() == 1){
                sum += i;
            }
        }

        return sum;
    }
}
