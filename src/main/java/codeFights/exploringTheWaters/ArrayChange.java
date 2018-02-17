package codeFights.exploringTheWaters;

public class ArrayChange {
    public static int arrayChange(int[] inputArray) {
        int previousValue = inputArray[0];
        int increaseCounter = 0;

        for (int i = 1; i < inputArray.length; i++) {
            while (inputArray[i]<=previousValue){
                inputArray[i]++;
                increaseCounter++;
            }
            previousValue = inputArray[i];
        }
        return increaseCounter;
    }
}
