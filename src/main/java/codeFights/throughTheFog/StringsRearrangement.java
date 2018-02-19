package codeFights.throughTheFog;

public class StringsRearrangement {
    public static boolean stringsRearrangement(String[] inputArray) {

        for (String string : inputArray) {
            if (countStringsWithOnlyDifference(inputArray, string) == 0) {
                return false;
            } else {
                ;
            }
        }
        return false;
    }

    private static int countStringsWithOnlyDifference(String[] inputArray, String string) {
        int mainCounter = 0;
        int counter = 0;

        for (String s : inputArray) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == string.charAt(i)) {
                    counter++;
                }
            }
            if (counter == 1) {
                mainCounter++;
            }
            counter = 0;
        }

        return mainCounter;
    }
}
