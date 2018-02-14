package codeFights;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MakeArrayConsecutive2 {
    public static int makeArrayConsecutive2(int[] statues) {
        List<Integer> statuesList = new ArrayList<>();
        for (int statue : statues) {
            statuesList.add(statue);
        }
        int max = statuesList.stream().max(Comparator.naturalOrder()).get();
        int min = statuesList.stream().min(Comparator.naturalOrder()).get();

        return (max - min + 1) - statues.length;
    }
}
