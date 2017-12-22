package string_3;

import java.util.regex.Pattern;

public class WithoutString {

    public static String withoutString(String base, String remove) {
        Pattern pattern = Pattern.compile(remove, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(base).replaceAll("");
    }
}
