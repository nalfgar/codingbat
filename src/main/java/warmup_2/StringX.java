package warmup_2;

public class StringX {
    public static String stringX(String str) {
        if (str.length() == 0 || str.length() == 1){
            return str;
        }
        StringBuilder result = new StringBuilder("");
        result.append(str.charAt(0));
        result.append(str.substring(1, str.length()-1).replaceAll("x",""));
        result.append(str.charAt(str.length()-1));
        return String.valueOf(result);
    }
}
