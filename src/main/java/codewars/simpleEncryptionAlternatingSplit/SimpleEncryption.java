package codewars.simpleEncryptionAlternatingSplit;

public class SimpleEncryption {
    public static void main(String[] args) {
        System.out.println(decrypt("hsi  etTi sats!", 2));
    }

    public static String encrypt(String text, int n) {
        if (n <= 0) {
            return text;
        }
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        StringBuilder result = new StringBuilder(text);

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < text.length() - 1; i += 2) {
                s1.append(result.charAt(i));
                s2.append(result.charAt(i + 1));
            }
            if (text.length() % 2 != 0) {
                s1.append(result.charAt(text.length() - 1));
            }
            result.delete(0, result.length());
            result.append(s2);
            result.append(s1);
            s1.delete(0, s1.length());
            s2.delete(0, s2.length());
        }
        return result.toString();
    }

    public static String decrypt(String text, int n) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println("i=" + i + " " +text.charAt(i));
        }
        System.out.println();

        System.out.println(text);
        if (n <= 0) {
            return text;
        }
        int textLenght = text.length();
        StringBuilder s0;
        StringBuilder lastChar;

        if (textLenght % 2 == 0) {
            s0 = new StringBuilder(text);
            lastChar = new StringBuilder("");
        } else {
            s0 = new StringBuilder(text.substring(0, textLenght - 1));
            lastChar = new StringBuilder(text.substring(textLenght - 2, textLenght-1));
        }

        System.out.println(s0 + "-");
        System.out.println(lastChar + "-");
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        StringBuilder result = new StringBuilder("");

//        for (int i = 0; i < textLenght; i += 2) {
//            s1.append(s0.charAt(i));
//            s2.append(s0.charAt(i+1));
//        }


        return result.toString();
    }
}
