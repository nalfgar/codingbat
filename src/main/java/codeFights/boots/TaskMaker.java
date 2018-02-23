package codeFights.boots;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMaker {
    public static String[] taskMaker(String[] givenSource, int challengeId) {
        Map<Integer, Matcher> mapDB = new HashMap<>();
        Pattern pattern = Pattern.compile("^(\"\\s+//DB )(\\d+)//(.*$)");
        Matcher matcher;
        String line;
        String goodLine;

        for (int i = 0; i < givenSource.length; i++) {
            line = givenSource[i];
            matcher = pattern.matcher(line);
            if (matcher.matches()) {
                mapDB.put(i, matcher);
            }
        }

        for (Map.Entry<Integer, Matcher> integerMatcherEntry : mapDB.entrySet()) {
            System.out.println(integerMatcherEntry.getKey() + " " + integerMatcherEntry.getValue());
        }
        return new String[0];
    }
}
