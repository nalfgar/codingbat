package codeFights.cornerOf0sAnd1s.killKthBit;

public class KillKthBit {
    public static int killKthBit(int n, int k) {

        return n & ~(1<<(k-1));
    }

}