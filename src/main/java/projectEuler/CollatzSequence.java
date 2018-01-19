package projectEuler;

public class CollatzSequence {

    public static int howLongIscollatzSequence(int n) {
        int counter = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            counter++;
        }
        return counter;
    }

    public static int longestCollatzSequence(int n){
        int max = 0;
        int lenghtOfSequence = 0;
        int result = 0;

        for (int i = 1; i < n; i++) {
            lenghtOfSequence = howLongIscollatzSequence(i);
            if (lenghtOfSequence > max) {
                max = lenghtOfSequence;
                result = i;
            }
        }

        return result;
    }
}
