package warmup_2;

import java.util.HashMap;

public class NoTriples {

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            if (nums[i+1] == first && nums[i+2] == first){
                return false;
            }
        }
        return true;
    }
}
