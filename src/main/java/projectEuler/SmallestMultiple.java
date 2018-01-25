package projectEuler;

public class SmallestMultiple {


    public static int smallestMultiple(int n) {
        int counter = 0;

        for (int i = 10; i < Integer.MAX_VALUE; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j != 0) {
                    continue;
                } else {
                    counter++;
                }
            }
            if (counter == n){
                return i;
            }
            counter = 0;

        }
        return 0;
    }
}
