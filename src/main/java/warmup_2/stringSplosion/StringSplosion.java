package warmup_2.stringSplosion;

import warmup_2.stringTimes.StringTimes;

public class StringSplosion {

    public static String stringSplosion(String str){
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < str.length()+1; i++) {
            stringBuilder.append(str.substring(0,i));
        }
        return stringBuilder.toString();
    }
}
