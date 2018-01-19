package projectEuler;

import java.util.LinkedList;
import java.util.List;

public class CollatzSequence {

    public static List<Integer> collatzSequence(int n) {
        List<Integer> result = new LinkedList<>();
        result.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            result.add(n);
        }
        return result;
    }

    public static int longestCollatzSequence(int n){
        int max = 0;
        int lenghtOfSequence = 0;
        int result = 0;

        for (int i = 1; i < n; i++) {
            lenghtOfSequence = collatzSequence(i).size();
            if (lenghtOfSequence > max) {
                max = lenghtOfSequence;
                result = i;
            }
        }

        return result;
    }
}
