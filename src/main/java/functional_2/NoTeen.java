package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().
                filter(i -> (i < 13 || i > 19)).
                collect(Collectors.toList());
    }
}
