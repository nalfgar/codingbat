package warmup_1.delDel;

public class DelDel {
    public static String delDel(String str) {
        if (str.length() < 4){
            return str;
        } else if (!(str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l')){
            return str;
        } else {
            return str.charAt(0) + str.substring(4);
        }
    }
}
