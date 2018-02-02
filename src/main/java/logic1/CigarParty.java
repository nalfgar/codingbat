package logic1;

public class CigarParty {
    private static final int MIN_CIGARS = 40;
    private static final int MAX_CIGARS = 60;

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend){
            return cigars >= MIN_CIGARS;
        } else {
            return cigars >= MIN_CIGARS && cigars <= MAX_CIGARS;
        }

    }
}

