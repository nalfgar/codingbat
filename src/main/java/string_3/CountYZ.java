package string_3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountYZ {
    public static int countYZ(String str) {
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(str);

        List<String> list = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            list.add(matcher.group(count));
            count++;
        }

        return (int) list.stream().
                filter(s -> s.endsWith("y") || s.endsWith("z") || s.endsWith("Y") || s.endsWith("Z")).count();
    }
}
