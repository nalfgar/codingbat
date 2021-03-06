package codeFights.interviewPractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {
    public static int firstDuplicate(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if (!map.containsKey(i)){
                map.put(i, 1);
            } else {
                return i;
            }
        }

        return -1;
    }
}
