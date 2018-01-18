package projectEuler;

import java.util.List;

public class MultiplesOf3and5 {

    public static int multiplesOf3and5(int max) {

        int sum = 0;

        long start=System.currentTimeMillis();
        for (int i = 3; i < max; i++) {
            if ((i%3==0 || i%5==0)) {
                sum += i;
            }
        }
        long stop=System.currentTimeMillis();
        System.out.println("Time of work:"+(stop-start) + "[ms]");

        return sum;
    }
}
