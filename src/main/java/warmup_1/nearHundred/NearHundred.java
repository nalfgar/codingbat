package warmup_1.nearHundred;

public class NearHundred {

    public static boolean nearHundred(int n) {
        if (n <= 150) {
            return Math.abs(100 - n) <= 10 ? true : false;
        }
        return Math.abs(200 - n) <= 10 ? true : false;
    }
}
