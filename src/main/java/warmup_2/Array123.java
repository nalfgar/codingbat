package warmup_2;

public class Array123 {

    public static boolean array123(int[] nums) throws Exception {
        if (nums.length < 3) {
            throw new Exception("Not enough integers (min. 3)");
        }
        boolean result = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1) {
                if ((nums[i + 1] == 2) && (nums[i + 2] == 3)) {
                    result = true;
                }
            }
        }
        return result;
    }
}
