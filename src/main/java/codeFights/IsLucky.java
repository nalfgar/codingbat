package codeFights;

public class IsLucky {
    public static boolean isLucky(int n) {
        String stringNumber = String.valueOf(n);
        int sum = 0;
        int begin, end;

        for (int i = 0; i < stringNumber.length() / 2; i++) {
            begin = Integer.valueOf(stringNumber.charAt(i));
            end = Integer.valueOf(stringNumber.charAt(stringNumber.length() - 1 - i));
            sum += begin - end;
        }

        return sum == 0;
    }
}
