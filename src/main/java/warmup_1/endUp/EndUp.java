package warmup_1.endUp;

public class EndUp {
    public static String endUp(String str) {
        int rest  = str.length() - 3;
        String begin;
        String end;

        if (rest <= 0){
            return  str.toUpperCase();
        }else {
            begin = str.substring(0, rest);
            end = str.substring(rest, str.length());
            return begin + end.toUpperCase();
        }
    }
}
