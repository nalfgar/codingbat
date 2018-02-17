package codeFights.islandOfKnowledge;

public class ArrayMaximalAdjacentDifference {
    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = 0;
        int diff;

        for (int i = 1; i < inputArray.length; i++) {
            diff = Math.abs(inputArray[i-1] - inputArray[i]);
            if (diff > max){
                max = diff;
            }
        }
        return max;
    }
}
