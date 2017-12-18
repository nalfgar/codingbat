package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {


    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(integer -> 2 * integer).collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(integer -> integer * integer).collect(Collectors.toList());
    }
}
