package warmup_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MixStart {

    public static boolean mixStart(String str) {
        final Pattern pattern = Pattern.compile("^.ix.*");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
