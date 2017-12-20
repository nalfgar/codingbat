package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {

    public static List<String> no34(List<String> strings) {
        return strings.stream().
                filter(string -> string.length() != 3).
                filter(string -> string.length() != 4).
                collect(Collectors.toList());
    }
}
