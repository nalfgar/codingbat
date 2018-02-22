package codeFights.commonTechniquesBasic;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i : b) {
            map.put(i, true);
        }

        for (int i : a) {
            if (map.containsKey(v-i)) {
                return true;
            }
        }
        return false;
    }
}
/*
 * First solution was loop over all a and b elements but it was very inefficient,
 * that solution dit not pass all tests (Execution too long).
 *
 */
