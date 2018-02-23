package codeFights.commonTechniquesBasic;


public class ArrayMaxConsecutiveSum2 {
    public static int arrayMaxConsecutiveSum2(int[] inputArray) {
        int currentSum = 0,
                currentMinimalSum = 0,
                result = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            currentSum += inputArray[i];
            if (currentSum - currentMinimalSum > result) {
                result = currentSum - currentMinimalSum;
            }
            if (currentSum < currentMinimalSum) {
                currentMinimalSum = currentSum;
            }
        }

        return result;
    }
}

//    It is my first idea, works but is O(n^2) :-(((
//    does not pass all test, it's to slow.
//    public static int arrayMaxConsecutiveSum2(int[] inputArray) {
//        int maxSum = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for (int i = 0; i < inputArray.length; i++) {
//            for (int j = i; j < inputArray.length; j++) {
//                sum = sum(inputArray, i, j);
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//        return maxSum;
//    }
//
//    private static int sum(int[] inputArray, int i, int j) {
//        int localSum = 0;
//        if (i == j) return inputArray[i];
//
//        for (int k = i; k <= j; k++) {
//            localSum += inputArray[k];
//        }
//        return localSum;
//    }
