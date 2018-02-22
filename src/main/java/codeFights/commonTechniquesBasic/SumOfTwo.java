package codeFights.commonTechniquesBasic;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        Map<Integer, Boolean> map = new HashMap<>();
        int diff;

        for (int i : b) {
            map.put(i, true);
        }

        for (int i : a) {
            diff = v - i;
            if (map.containsKey(diff)){
                return true;
            }
        }
        return false;
    }
}
