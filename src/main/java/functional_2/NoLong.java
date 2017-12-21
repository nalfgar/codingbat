package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

    public static List<String> noLong(List<String> strings) {
        return strings.stream().
                filter(string -> string.length() < 4).
                collect(Collectors.toList());
    }
}
