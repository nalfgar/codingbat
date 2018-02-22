package codeFights.commonTechniquesBasic;

import java.util.ArrayList;
import java.util.List;

public class SumInRange {

    public static int sumInRange(int[] nums, int[][] queries) {
        if (nums.length  == 0 || queries.length == 0) return 0;

        List<Integer> list = new ArrayList<>();
        int mod = 1000000007;

        for (int[] query : queries) {
            list.add(sumarize(nums, query[0], query[1]));
        }

        return (sumarize(list) + mod) % mod;
    }

    private static Integer sumarize(int[] nums, int i, int j) {
        int mod = 1000000007;
        int sum = 0;
        for (int k = i; k < j + 1; k++) {
            sum += nums[k] % mod;
        }
        return sum;
    }

    private static Integer sumarize(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}