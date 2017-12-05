package warmup_1.sleepIn;

public class SleepIn {


    public SleepIn(boolean weekDay, boolean vacation) {
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false){
            return false;
        } else return true;
    }
}
