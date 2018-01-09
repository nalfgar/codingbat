package warmup_2;

public class CountXX {
    public static int countXX(String str) {
        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i) == str.charAt(i + 1)) result++;
            }
        }

        return result;
    }
}
