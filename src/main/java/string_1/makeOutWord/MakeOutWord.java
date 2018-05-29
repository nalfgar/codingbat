package string_1.makeOutWord;

public class MakeOutWord {
    public static String MakeOutWord(String out, String word) {

        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}
