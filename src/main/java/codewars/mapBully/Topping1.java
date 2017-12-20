package codewars.mapBully;

import java.util.HashMap;

public class Topping1 {
    public static HashMap<String,String> topping1(HashMap<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
}
