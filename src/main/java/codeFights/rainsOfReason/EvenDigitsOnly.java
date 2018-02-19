package codeFights.rainsOfReason;

public class EvenDigitsOnly {
    public static boolean evenDigitsOnly(int n) {
        String stringN = String.valueOf(n);

        for (int i = 0; i < stringN.length(); i++) {
            if (Integer.valueOf(String.valueOf(stringN.charAt(i)))%2!=0){
                return false;
            }
        }
        return true;
    }
}
