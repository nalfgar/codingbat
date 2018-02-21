package codeFights.cornerOf0sAnd1s.secondRightmostZeroBit;

public class SecondRightmostZeroBit {
    public static int secondRightmostZeroBit(int n) {
        return ~((n+1)|n) & (((n+1)|n)+1);
    }
}
