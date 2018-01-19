package codility;


// Correctness 100%
// Performance 33%
//Task score 71% :-(
public class CountFactors {
    public static void main(String[] args) {
        System.out.println(countFactors(39916800));
    }

    public static int countFactors(int N) {
        int counter = 2;

        if (N == 1) {
            counter = 1;
        } else if (N == 2) {
            counter = 2;
        } else if (N % 2 != 0) {
            for (int i = 3; i < (N / 2); i += 2) {
                if (N % i == 0) {
                    counter++;
                }
            }
        } else {
            for (int i = 2; i <= ( N / 2); i++) {
                if (N % i == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
