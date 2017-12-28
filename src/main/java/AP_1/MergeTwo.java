package AP_1;

import java.util.ArrayList;
import java.util.List;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        List<String> result = new ArrayList<>(a.length + b.length);
        String[] resultArray = new String[n];

        arrayToList(a, result);
        arrayToList(b, result);
        java.util.Collections.sort(result);

        for (int i = 0; i < n; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    private static void arrayToList(String[] a, List<String> result) {
        for (int i = 0; i < a.length; i++) {
            if (!result.contains(a[i])) {
                result.add(a[i]);
            }
        }
    }
}
