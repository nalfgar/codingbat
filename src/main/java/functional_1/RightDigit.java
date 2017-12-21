package functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().
                map(integer -> integer % 10).
                collect(Collectors.toList());
    }
}
