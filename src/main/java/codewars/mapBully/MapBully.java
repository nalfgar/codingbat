package codewars.mapBully;

import java.util.HashMap;

public class MapBully {


    public static HashMap<String, String> mapBully(HashMap<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null){
            map.put("a", "");
            map.put("b", aValue);
        }

        return map;
    }

}
