package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().
                map(integer -> integer * 2).
                filter(integer -> integer % 10 != 2).
                collect(Collectors.toList());
    }
}
