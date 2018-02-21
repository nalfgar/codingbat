package codeFights.cornerOf0sAnd1s.mirrorBits;

public class MirrorBits {
    public static int mirrorBits(int a) {
        String binaryA = Integer.toBinaryString(a);
        binaryA = reverse(binaryA);
        return Integer.valueOf(binaryA, 2);
    }

    private static String reverse(String binaryA) {
        String reversed = "";
        for (int i = binaryA.length() -1 ; i >= 0; i--) {
            reversed += binaryA.charAt(i);
        }
        return reversed;
    }
}
