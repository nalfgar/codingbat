package codeFights.atTheCrossroads.knapsackLight;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class KnapsackLight {
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(weight1, value1);
        map.put(weight2, value2);
        int strongerHand = 0;
        int weakestHand = 0;


        if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        } else if (weight1 > maxW && weight2 > maxW) {
            return 0;
        } else {
            strongerHand = map.keySet().stream().max(Comparator.naturalOrder()).get();
            weakestHand = map.keySet().stream().min(Comparator.naturalOrder()).get();
            if (strongerHand >= maxW) {
                return map.get(weakestHand);
            } else if (map.get(strongerHand) >= map.get(weakestHand)) {
                return map.get(strongerHand);
            } else if(map.get(weakestHand) >= map.get(strongerHand)){
                return map.get(weakestHand);
            }
        }
        return 0;
    }
}
