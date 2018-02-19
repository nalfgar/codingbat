package codeFights.throughTheFog;

import java.util.LinkedHashMap;
import java.util.Map;

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int halfLoop = n / 2;

        for (int i = 0; i <= n; i++) {
            if (i < halfLoop){
                map.put(i, i + halfLoop);
            } else if (i != n){
                map.put(i, i - halfLoop);
            } else {
                map.put(i, 0);
            }
        }
        return map.get(firstNumber);
    }
}
