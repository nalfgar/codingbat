package codewars.variabonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tribonacci {
    public static void main(String[] args) {
        for (double v : tribonnaci(new double[]{0, 0, 1}, 5)) {
            System.out.println(v);
        }
        System.out.println();
    }

    public static double[] tribonnaci(double[] s, int n){
        if (s.length <= 2){
            return s;
        }
        List<Double> result = new ArrayList<Double>();
        for (double v : s) {
            result.add(v);
        }

        double sum = 0;
        while (result.size() < n) {
            for (int j = result.size() - 3; j < result.size(); j++) {
                sum += result.get(j);
            }
            result.add(sum);
            sum = 0;
        }

        double[] arrayResult = new double[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }

        return arrayResult;
    }
}