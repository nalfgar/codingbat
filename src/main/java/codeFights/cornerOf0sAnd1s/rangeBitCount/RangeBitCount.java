package codeFights.cornerOf0sAnd1s.rangeBitCount;

public class RangeBitCount {
    public static int rangeBitCount(int a, int b) {
        int sumOf1s = 0;

        for (int i = a; i <= b ; i++) {
            sumOf1s += count1sInBinaryRepresentation(i);
        }
        return sumOf1s;
    }

    private static int count1sInBinaryRepresentation(int i) {
        String binaryI = Integer.toBinaryString(i);
        int sum = 0;
        for (int j = 0; j < binaryI.length(); j++) {
            if (binaryI.charAt(j) == '1') sum++;
        }
        return sum;
    }
}
