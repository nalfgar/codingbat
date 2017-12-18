package functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(string -> string + "*").collect(Collectors.toList());
    }
}
