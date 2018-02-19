package codeFights.atTheCrossroads.reachNextLevel;

public class ReachNextLevel {
    public static boolean reachNextLevel(int experience, int threshold, int reward) {
        return experience + reward >= threshold;
    }
}
