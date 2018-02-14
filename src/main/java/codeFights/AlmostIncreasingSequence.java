package codeFights;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {
    public static boolean almostIncreasingSequence(int[] sequence) {
        List<Integer> listSequence = new ArrayList<>();

        if (sequence.length == 2) {
            return true;
        } else {
            for (int i = 0; i < sequence.length; i++) {
                for (int j = 0; j < sequence.length; j++) {
                    if (i != j) {
                        listSequence.add(sequence[j]);
                    }
                }
                if (isStrictlyIncreasingSequence(listSequence)) return true;
                listSequence.clear();
            }

        }
        return false;
    }

    protected static boolean isStrictlyIncreasingSequence(List<Integer> listSequence) {
        Integer previousInt = listSequence.get(0);
        for (int i = 1; i < listSequence.size(); i++) {
            if (listSequence.get(i) <= previousInt) {
                return false;
            }
            previousInt = listSequence.get(i);
        }
        return true;
    }
}

