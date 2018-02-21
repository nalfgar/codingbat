package codeFights.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Sudoku2 {
    public static boolean sudoku2(char[][] grid) {

        for (char[] chars : grid) {
            if (!isNineValid(chars)) {
                return false;
            }
        }

        char[] chars;
        for (int i = 0; i < grid[0].length; i++) {
            chars = getColumn(grid, i);
            if (!isNineValid(chars)) {
                return false;
            }
        }

        for (int i = 1; i < 8; i += 3) {
            for (int j = 1; j < 8; j += 3) {
                chars = getRectangle(grid, i, j);
                if (!isNineValid(chars)) {
                    return false;
                }
            }
        }

        return true;
    }


    private static boolean isNineValid(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (char aChar : chars) {
            if (aChar != '.') {
                if (!map.containsKey(aChar)) {
                    map.put(aChar, 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static char[] getRectangle(char[][] grid, int i, int j) {
        char[] box = new char[grid.length];

        int counter = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                box[counter] = grid[k][l];
                counter++;
            }
        }
        return box;

    }

    private static char[] getColumn(char[][] grid, int i) {
        char[] column = new char[grid.length];

        int rowCounter = 0;
        for (int j = 0; j < grid.length; j++) {
            column[rowCounter] = grid[j][i];
            rowCounter++;
        }
        return column;
    }
}