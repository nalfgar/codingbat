package codeFights.rainsOfReason;

import java.util.HashMap;
import java.util.Map;

public class ChessBoardCellColor {
    public static boolean chessBoardCellColor(String cell1, String cell2) {
        Map<String, Integer> columns = new HashMap<>();
        columns.put("A", 1);
        columns.put("B", 2);
        columns.put("C", 3);
        columns.put("D", 4);
        columns.put("E", 5);
        columns.put("F", 6);
        columns.put("G", 7);
        columns.put("H", 8);
        int[][] oddEven = new int[][]{{1, 0, 1, 0, 1, 0, 1, 0}, {0, 1, 0, 1, 0, 1, 0, 1}};

        int cell1Row = Integer.valueOf(String.valueOf(cell1.charAt(1))) % 2;
        int cell1Col = columns.get(String.valueOf(cell1.charAt(0)));
        int cell2Row = Integer.valueOf(String.valueOf(cell2.charAt(1))) % 2;
        int cell2Col = columns.get(String.valueOf(cell2.charAt(0)));


        return oddEven[cell1Row][cell1Col - 1] == oddEven[cell2Row][cell2Col - 1];
    }
}
