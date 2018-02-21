package codeFights.cornerOf0sAnd1s.arrayPacking;

public class ArrayPacking {
    public static int arrayPacking(int[] a) {
        String sumString = "";
        String byteI;
        for (int i : a) {
            byteI = expandToOneByte(Integer.toBinaryString(i));
            sumString = byteI + sumString;
        }

        return Integer.valueOf(sumString, 2);
    }

    private static String expandToOneByte(String s) {
        if (s.length() == 8) {
            return s;
        }
        while (s.length() < 8) {
            s = "0" + s;
        }
        return s;
    }
}
