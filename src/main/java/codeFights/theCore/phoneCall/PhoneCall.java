package codeFights.theCore.phoneCall;

public class PhoneCall {
    public static int phoneCall(int min1, int min2_10, int min11, int s) {
        int minutsCounter = 0;
        int round2_10;
        int rest_2_10;

        if (min1 * 1 > s) {
            return 0;
        } else {
            minutsCounter++;
            s -= min1;
            round2_10 = s / min2_10;
            rest_2_10 = s % min2_10;

            if (round2_10 <= 9) {
                minutsCounter += round2_10;
                s = rest_2_10;
                return minutsCounter;
            } else {
                minutsCounter += 9;
                s -= min2_10 * 9;
            }
            if (s >= min11) {
                minutsCounter += s / min11;
            }
        }

        return minutsCounter;
    }
}
