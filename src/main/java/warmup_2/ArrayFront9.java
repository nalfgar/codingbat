package warmup_2;

public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        Boolean result = false;

        for (int i = 0; (i < nums.length && i < 3); i++) {
            if (nums[i] == 9) result = true;
        }

        return result;
    }

}
