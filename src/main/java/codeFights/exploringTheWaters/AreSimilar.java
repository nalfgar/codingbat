package codeFights.exploringTheWaters;

public class AreSimilar {
    public static boolean areSimilar(int[] a, int[] b) {
        int[] arrayDifference;
        int theSameElementCounter = getNumberOfTheSameElementsInArrays(a, b);

        if (theSameElementCounter == a.length) {
            return true;
        } else if (a.length - theSameElementCounter > 2) {
            return false;
        }
        arrayDifference = getDifferences(a, b);
        if (arrayDifference[0] == arrayDifference[3] && arrayDifference[1] == arrayDifference[2]) {
            return true;
        }

        return false;
    }

    private static int[] getDifferences(int[] a, int[] b) {
        int[] result = new int[4];
        int loopCounter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                result[loopCounter] = a[i];
                result[loopCounter + 1] = b[i];
                loopCounter += 2;
            }
        }

        return result;
    }

    private static int getNumberOfTheSameElementsInArrays(int[] a, int[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                counter++;
            }
        }
        return counter;
    }
}
