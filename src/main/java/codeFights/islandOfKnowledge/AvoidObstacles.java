package codeFights.islandOfKnowledge;

public class AvoidObstacles {
    public static int avoidObstacles(int[] inputArray) {
        int jump = 2;

        while (!noDivisible(inputArray, jump)) {
            jump++;
        }
        return jump;
    }

    private static boolean noDivisible(int[] inputArray, int jump) {
        for (int i : inputArray) {
            if (i%jump==0){
                return false;
            }
        }
        return true;
    }
}
