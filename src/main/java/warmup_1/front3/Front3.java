package warmup_1.front3;

public class Front3 {
    public static String front3(String str) {
        if (str.length() == 0){
            return str;
        } else if (str.length() <= 3){
            return str + str + str;
        }
        String first3 = str.substring(0, 3);
        return first3 + first3 + first3;
    }
}
