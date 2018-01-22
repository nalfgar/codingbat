package projectEuler;

import java.math.BigInteger;

public class PowerDigitSum {
    public static int PowerDigitSum(int n) {
        int sum = 0;
        BigInteger number = new BigInteger("2");
        String stringNumber;

        number = number.pow(n);
        stringNumber = String.valueOf(number);

        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }

        return sum;
    }
}
