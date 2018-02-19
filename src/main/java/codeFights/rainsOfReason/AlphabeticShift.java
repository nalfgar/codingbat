package codeFights.rainsOfReason;

public class AlphabeticShift {
    public static String alphabeticShift(String inputString) {
        String result = "";
        char letter = '0';

        for (int i = 0; i < inputString.length(); i++) {
            letter = inputString.charAt(i);
            if (letter == 'z') {
                letter = 'a';
            } else {
                letter = (char) (letter + 1);
            }
            result += String.valueOf(letter);
        }
        return result;
    }
}
