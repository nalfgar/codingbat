package AP_1;

public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {

        int[] result = new int[count];
        int countResult = 0;

        for (int i = 0; i < nums.length && countResult < count; i++) {
            if (nums[i]%2 == 0) {
                result[countResult] = nums[i];
                countResult++;
            }
        }

        return result;
    }
}
