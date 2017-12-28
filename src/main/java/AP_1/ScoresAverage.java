package AP_1;

public class ScoresAverage {
    public static int scoresAverage(int[] scores) {
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length/2){
                firstSum += scores[i];
            } else {
                secondSum += scores[i];
            }
        }
        return firstSum > secondSum ? firstSum/(scores.length/2) : secondSum/(scores.length/2);
    }
}
