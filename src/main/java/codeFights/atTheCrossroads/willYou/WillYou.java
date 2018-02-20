package codeFights.atTheCrossroads.willYou;

import java.util.HashMap;
import java.util.Map;

public class WillYou {
    public static boolean willYou(boolean young, boolean beautiful, boolean loved) {
        String string = addBooleanToString(young);
        string += addBooleanToString(beautiful);
        string += addBooleanToString(loved);

        Map<String, Integer> map = new HashMap<>();
        map.put("001",0);
        map.put("011",0);
        map.put("101",0);
        map.put("110",0);

        return map.containsKey(string);
    }

    private static String addBooleanToString(boolean bool) {
        if (bool){
            return "1";
        } else return  "0";
    }
}
