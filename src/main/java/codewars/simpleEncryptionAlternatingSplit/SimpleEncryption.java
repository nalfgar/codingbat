package codewars.simpleEncryptionAlternatingSplit;

public class SimpleEncryption {
    public static void main(String[] args) {

        System.out.println(encrypt("12345", 1));
        System.out.println(decrypt("24135", 1));
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
        if (n <= 0) {
            return text;
        }

        for (int i = 1; i <= n; i++) {
            text = oneHash(text);
        }

        return text;
    }

    private static String oneHash(String str) {
        int textLenght = str.length();

        StringBuilder s = new StringBuilder(str);
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");;
        StringBuilder sEnd = new StringBuilder("");
        StringBuilder result = new StringBuilder("");

        if (textLenght%2==0) {
            s1.append(s.substring(0, textLenght/2));
            s2.append(s.substring(textLenght/2, textLenght));
        } else {
            s1.append(s.substring(0, (textLenght-1)/2));
            s2.append(s.substring((textLenght-1)/2, textLenght-1));
            sEnd.append(s.substring(textLenght-1, textLenght));
        }
        for (int j = 0; j < s1.length(); j++) {
            result.append(s2.charAt(j));
            result.append(s1.charAt(j));

        }
        return result.append(sEnd).toString();
    }
}
