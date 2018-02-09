package warmup_2.arrayCount9;

public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (i == 9) counter++;
        }
        return counter;
    }
}
