package projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciNumbers {

    public static List<BigInteger> fibonacciNumbers(int n) {
        List<BigInteger> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(new BigInteger("1"));
        fibonacciNumbers.add(new BigInteger("2"));

        int counter = 2;
        BigInteger last;
        BigInteger oneBeforeLast;
        int size;

        while (counter < n){
            size = fibonacciNumbers.size();
            last = fibonacciNumbers.get(size-1);
            oneBeforeLast = fibonacciNumbers.get(size-2);
            fibonacciNumbers.add(oneBeforeLast.add(last));
            counter++;
        }

        return fibonacciNumbers;
    }


    public static List<BigInteger> fibonacciEvenNumbers(int n) {
        List<BigInteger> fibonacciNumbers = fibonacciNumbers(n);
        List<BigInteger> fibonacciNumbers4 = fibonacciNumbers(n);
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        BigInteger fourMilion = new BigInteger("4000000");


        return fibonacciNumbers.stream().filter(bigInteger -> bigInteger.mod(two).equals(zero)).collect(Collectors.toList());
//        code below returns sum for elements smaller than 4000000
//        fibonacciNumbers4 = fibonacciNumbers.stream().filter(bigInteger -> bigInteger.mod(two).equals(zero)).collect(Collectors.toList());
//        return fibonacciNumbers4.stream().filter(bigInteger -> bigInteger.compareTo(fourMilion) < 1).collect(Collectors.toList());
    }

    public static BigInteger sumFibonacciEvenNumbers(int n) {
        BigInteger sum = new BigInteger("0");
        List<BigInteger> fibonacciEvenNumbers = fibonacciEvenNumbers(n);

        for (BigInteger fibonacciEvenNumber : fibonacciEvenNumbers) {
            sum = sum.add(fibonacciEvenNumber);
        }

        return sum;
    }
}
