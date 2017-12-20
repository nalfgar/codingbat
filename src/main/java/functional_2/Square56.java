package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {

    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().
                map(integer -> (integer * integer)+10).
                filter(integer -> integer%10 != 5).
                filter(integer -> integer%10 != 6).
                collect(Collectors.toList());
    }
}
