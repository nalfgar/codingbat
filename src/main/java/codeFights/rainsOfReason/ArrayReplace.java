package codeFights.rainsOfReason;

public class ArrayReplace {
    public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace){
                inputArray[i] = substitutionElem;
            }
        }

        return inputArray;
    }
}
