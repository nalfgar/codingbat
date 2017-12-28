package AP_1;

public class ScoreUp {

    public static int scoreUp(String[] key, String[] answers) {

        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals(key[i])){
                score += 4;
            } else if (answers[i].equals("?")){
                score += 0;
            } else {
                score += -1;
            }
        }
        return score;
    }
}
