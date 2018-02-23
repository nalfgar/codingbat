package codeFights.divingDeeper;

import java.util.ArrayList;
import java.util.List;

public class ExtractEachKth {
    public static int[] extractEachKth(int[] inputArray, int k) {
        if (k == 1) {
            return new int[]{};
        } else if (k > inputArray.length){
            return inputArray;
        }

        List<Integer> list = new ArrayList<>();
        int counter = 1;
        int[] result;

        for (int i = 0; i < k - 1; i++) list.add(inputArray[i]);

        for (int i = k; i < inputArray.length; i++) {
            if (counter == k) {
                counter = 1;
                continue;
            }
            list.add(inputArray[i]);
            counter++;
        }

        counter = 0;
        result = new int[list.size()];
        for (Integer integer : list) {
            result[counter] = integer;
            counter++;
        }
        return result;
    }
}
