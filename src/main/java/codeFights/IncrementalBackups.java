package codeFights;

import java.util.*;

public class IncrementalBackups {
    public static int[] incrementalBackups(int lastBackupTime, int[][] changes) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int[] result;

        for (int i = 0; i < changes.length; i++) {
            if (changes[i][0] > lastBackupTime) {
                set.add(changes[i][1]);
            }
        }
        for (Integer integer : set) {
            list.add(integer);
        }
        list.sort(Comparator.naturalOrder());

        result = new int[set.size()];
        int j = 0;
        for (Integer i : list) {
            result[j] = i;
            j++;

        }
        return result;
    }
}
