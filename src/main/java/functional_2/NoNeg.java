package functional_2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NoNeg {


    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(integer -> integer >= 0).collect(Collectors.toList());
    }
}
