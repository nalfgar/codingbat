package codeFights.edgeOfTheOcean;

public class AlmostIncreasingSequence {
    public static boolean almostIncreasingSequence(int[] sequence) {

        if (sequence.length == 2) {
            return true;
        } else if (strictIncreasingSequence(sequence)) {
            return false;
        } else if (strictIncreasingSequence(makeSequenceWithoutIndex(sequence, 0 )) || strictIncreasingSequence(makeSequenceWithoutIndex(sequence, sequence.length))){
            return true;
        } else {
            for (int i = 1; i < sequence.length-1; i++) {
                if (sequence[i-1] < sequence[i] && sequence[i] > sequence[i+1]){
                    if (strictIncreasingSequence(makeSequenceWithoutIndex(sequence, i)) == false){
                        return strictIncreasingSequence(makeSequenceWithoutIndex(sequence, i+1));
                    }
                    return strictIncreasingSequence(makeSequenceWithoutIndex(sequence, i));
                } else if (sequence[i-1] > sequence[i] && sequence[i] < sequence[i+1]){
                    return strictIncreasingSequence(makeSequenceWithoutIndex(sequence, i+1));
                }
            }

        }
        return false;
    }


    protected static boolean strictIncreasingSequence(int[] sequence) {
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] makeSequenceWithoutIndex(int[] sequence, int index) {
        int[] result = new int[sequence.length - 1];

        if (index == 0) {
            for (int i = 1; i < sequence.length; i++) {
                result[i - 1] = sequence[i];
            }
        } else if (index == sequence.length) {
            for (int i = 0; i < sequence.length - 1; i++) {
                result[i] = sequence[i];
            }
        } else {
            for (int i = 0; i < index; i++) {
                result[i] = sequence[i];
            }
            for (int i = index; i < sequence.length-1; i++) {
                result[i] = sequence[i+1];
            }
        }
        return result;
    }
}
