package codeFights.bits;

public class InsertBits {


    public static int insertBits(int n, int a, int b, int k) {
        while (Integer.toBinaryString(k).length() < b) {
            k <<= 1;
        }
        return n+k;
    }
}
