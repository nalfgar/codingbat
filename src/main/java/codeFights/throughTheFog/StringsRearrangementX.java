package codeFights.throughTheFog;

import java.util.Arrays;

public class StringsRearrangementX {
    static boolean stringsRearrangement(String[] inputArray) {
        for (String startingStr : inputArray)
            if (canRearrange(startingStr, without(startingStr, inputArray)))
                return true;
        return false;
    }

    static boolean canRearrange(String start, String[] remaining) {
        if (remaining.length == 0)
            return true;
        System.out.println("Checking if " + start + " can lead to one of " + Arrays.toString(remaining));
        for (String next : remaining)
            if (diffs(start, next) == 1)
                if (canRearrange(next, without(next, remaining)))
                    return true;
        return false;
    }

    static String[] without(String toRemove, String[] arr) {
        if (arr.length == 0)
            return arr;
        String[] res = new String[arr.length - 1];
        int indx = 0;
        for (int i = 0; i < arr.length; i++, indx++)
            if (arr[i].equals(toRemove))
                break;
        for (int i = 0, j = 0; i < arr.length; i++, j++)
            if (i != indx)
                res[j] = arr[i];
            else
                j--;
        return res;
    }

    static int diffs(String a, String b) {
        int res = 0;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                res++;
        return res;
    }
}