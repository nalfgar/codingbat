package codeFights.divingDeeper;

public class ArrayMaxConsecutiveSum {
    public static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int result = 0;
        int localSum = 0;

        for (int i = 0; i < inputArray.length - k + 1; i++) {

            localSum = sumarize(inputArray, i, i + k - 1);
            if (localSum > result) {
                result = localSum;
            }
        }

        return result;
    }

    private static int sumarize(int[] inputArray, int i, int j) {
        int sum = 0;
        for (int k = i; k < j + 1; k++) {
            sum += inputArray[k];
        }
        return sum;
    }
}
