package codewars.sumOfTheFirstNthTermOfSeries;


/*
Task:
Your task is to write a function which returns the sum of following
series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

Rules:
You need to round the answer to 2 decimal places and return it as String.
If the given value is 0 then it should return 0.00
You will only be given Natural Numbers as arguments.
*/
public class NthSeries {
    public static void main(String[] args) {
        nthSeries(2);
    }

    public static String nthSeries(int n) {
        if (n == 0){
            return "0.00";
        } else if (n == 1){
            return "1.00";
        } else {
            Double sum = 1.0;
            int counter = 0;

            for (int i = 2; i <= n; i++) {
                sum += 1.0/((2*i) + counter);
                counter++;
            }
            return String.format("%.2f", sum);
        }

    }
}
