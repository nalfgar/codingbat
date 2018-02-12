package warmup_1.startOz;

public class StartOz {
    public static String startOz(String str) {
        String result = new String("");
        if (str.length()>=2) {
            if (str.charAt(0) == 'o') {
                result += "o";
            }
            if (str.charAt(1) == 'z') {
                result += "z";
            }
        } else if (str.length() == 1){
            if (str.charAt(0) == 'o'){
                result += "o";
            }
        }
        return result;
    }
}
