package warmup_2;

public class Array667 {
    public static int array667(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result++;
            }
        }
        return result;
    }
}
