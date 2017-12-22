package string_3;

public class EqualIsNot {


    public static boolean equalIsNot(String str) {
        int counterIs = 0;
        int counterNot = 0;

        while (str.contains("is")) {
            str = str.replaceFirst("is", "*");
            counterIs++;
        }
        while (str.contains("not")) {
            str = str.replaceFirst("not", "*");
            counterNot++;
        }
        return counterIs == counterNot;
    }
}
