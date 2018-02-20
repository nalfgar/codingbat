package codeFights.atTheCrossroads.tennisSet;

import java.util.ArrayList;
import java.util.List;

public class TennisSet {
    public static boolean tennisSet(int score1, int score2) {
        String score = String.valueOf(score1) + String.valueOf(score2);
        List<String> posibleScores = new ArrayList<>();

        posibleScores.add("06");
        posibleScores.add("16");
        posibleScores.add("26");
        posibleScores.add("36");
        posibleScores.add("46");
        posibleScores.add("57");
        posibleScores.add("67");
        posibleScores.add("76");
        posibleScores.add("75");
        posibleScores.add("64");
        posibleScores.add("63");
        posibleScores.add("62");
        posibleScores.add("61");
        posibleScores.add("60");

        return posibleScores.contains(score);
    }
}
