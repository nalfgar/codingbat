package codeFights.smoothSailing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByHeight {
    public static int[] sortByHeight(int[] toSort) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < toSort.length; i++) {
            if (toSort[i] != -1) {
                list.add(toSort[i]);
            }
        }
        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < toSort.length; i++) {
            if (toSort[i] != -1){
                toSort[i] = list.get(0);
                list.remove(0);
            }
        }

        return toSort;
    }
}
