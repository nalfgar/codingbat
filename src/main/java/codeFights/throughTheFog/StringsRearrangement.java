package codeFights.throughTheFog;

import java.util.LinkedList;
import java.util.List;

public class StringsRearrangement {
    public static boolean stringsRearrangement(String[] inputArray) {
        List<Integer> listOfSimilarities = new LinkedList<>();

        fillListOfSimilarities(inputArray, listOfSimilarities);

        if (hasSameZeros(listOfSimilarities)) {
            return false;
        } else if (hasSameOnes(listOfSimilarities)) {
            return true;
        }


        return false;
    }

    private static boolean hasSameOnes(List<Integer> listOfSimilarities) {
        for (Integer similarity : listOfSimilarities) {
            if (similarity != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasSameZeros(List<Integer> listOfSimilarities) {
        for (Integer similarity : listOfSimilarities) {
            if (similarity != 0) {
                return false;
            }
        }
        return true;
    }

    private static void fillListOfSimilarities(String[] inputArray, List<Integer> listOfSimilarities) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                listOfSimilarities.add(countSimilarities(inputArray[i], inputArray[j]));
            }
        }
    }

    private static Integer countSimilarities(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
