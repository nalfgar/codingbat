package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFactors {
    public static int countFactors(int N) {
        Map<Integer, Boolean> a = new HashMap<>();
        int counter = 2;

        if (N == 1) {
            counter = 1;
        } else if (N == 2) {
            counter = 2;
        } else if (N % 2 != 0) {
            for (int i = 3; i < N; i += 2) {
                if (N % i == 0) {
                    counter++;
                }
            }
        } else {

        }

        return counter;
    }
}
