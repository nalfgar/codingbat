package codeFights.darkWilderness;

public class DigitDegree {
    public static int digitDegree(int n) {
        int counter = 0;
        int sum = 0;
        String stringS = String.valueOf(n);

        while (stringS.length() > 1){
            for (int i = 0; i < stringS.length(); i++) {
                sum += Integer.valueOf(String.valueOf(stringS.charAt(i)));
            }
            counter++;
            stringS = String.valueOf(sum);
            sum = 0;
        }

        return counter;
    }
}
