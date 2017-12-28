package AP_1;

import java.util.List;
import java.util.stream.Collectors;

public class WordsWithoutList {


    public static List<String> wordsWithoutList(List<String> words, int len) {

        return words.
                stream().
                filter(s -> s.length()!=len).
                collect(Collectors.toList());
    }
}
