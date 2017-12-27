package AP_1;

public class ScoresIncreasing {
    public static boolean scoresIncreasing(int[] scores) {
        boolean result = false;

        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] <= scores[i+1]){
                result = true;
            } else return false;
        }
        return result;
    }
}
