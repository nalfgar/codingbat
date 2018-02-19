package codeFights.atTheCrossroads.knapsackLight;

public class KnapsackLight {
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

        if (weight1 + weight2 <= maxW){
            return value1 + value2;
        } else if (weight1 <= maxW && weight1 > weight2){
            return value1;
        } else if (weight2 <= maxW && weight2 > weight1){
            return value2;
        }
        return 0;
    }
}
