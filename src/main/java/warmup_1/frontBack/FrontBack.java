package warmup_1.frontBack;

public class FrontBack {

    public static String frontBack(String str) {
        if (str.length() == 0 || str.length() == 1){
            return str;
        }
        char first;
        char last;
        StringBuilder score = new StringBuilder(str);
        first = str.charAt(0);
        last = str.charAt(str.length()-1);
        score.deleteCharAt(str.length()-1);
        score.deleteCharAt(0);

        return String.format("%s%s%s", last, score, first);
    }
}
