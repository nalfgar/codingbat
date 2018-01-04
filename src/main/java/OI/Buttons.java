package OI;

public class Buttons {
    public static void main(String[] args) {
        int[] inputTable = {1, 1, 1, 8, 1, 1, 1, 8, 2, 7};
        int[] output = buttons(7, 10, inputTable);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static int[] buttons(int buttonCounter, int pushCounter, int[] input) {
        int[] result = new int[buttonCounter];

        int max = 0;

        for (int button : input) {
            if (button < buttonCounter + 1) {
                result[button - 1]++;
            } else {
                max = getMaxFromTable(result);
                for (int i = 0; i < result.length; i++) {
                    result[i] = max;
                }
            }
        }

        return result;
    }

    public static int getMaxFromTable(int[] table) {
        int max = Integer.MIN_VALUE;
        for (int i : table) {
            if (i > max) max = i;
        }
        return max;
    }
}