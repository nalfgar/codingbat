package AP_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonTwo {
    public static int commonTwo(String[] a, String[] b) {
        Map<String, Integer> resultMap = new HashMap<>();

        int result = 0;

        for (String string : a) {
            if (!resultMap.containsKey(string)) {
                resultMap.put(string, 1);
            }
        }
        for (String string : b) {
            if (resultMap.containsKey(string)) {
                resultMap.put(string, 2);
            }
        }

        for (Integer integer : resultMap.values()) {
            if (integer>1){
                result++;
            }
        }
        System.out.println();
        return result;
    }
}
