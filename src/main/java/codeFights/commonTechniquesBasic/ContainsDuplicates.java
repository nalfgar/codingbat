package codeFights.commonTechniquesBasic;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] a) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i : a) {
            if (!map.containsKey(i)){
                map.put(i, true);
            }else return true;
        }
        return false;
    }
}
