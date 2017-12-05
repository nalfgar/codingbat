package warmup_1.parrotTrouble;

public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20) ? true : false;
    }
}
