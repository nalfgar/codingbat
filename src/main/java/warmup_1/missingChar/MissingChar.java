package warmup_1.missingChar;

public class MissingChar {
    public static String missingChar(String str, int n) {
        StringBuilder result = new StringBuilder("");

        for (int j = 0; j < str.length(); j++){
            if (j!=n){
                result.append(str.charAt(j));
            }
        }
        return result.toString();
    }
}
