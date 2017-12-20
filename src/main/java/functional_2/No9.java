package functional_2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class No9 {
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(integer -> integer%10 != 9).collect(Collectors.toList());
    }
}
