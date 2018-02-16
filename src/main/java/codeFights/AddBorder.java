package codeFights;

public class AddBorder {
    public static String[] addBorder(String[] picture) {
        String[] result = new String[picture.length + 2];
        int lineLenght = picture[0].length() + 2;
        String emptyLine = makeEmptyLine(lineLenght);

        result[0] = emptyLine;
        result[result.length-1] = emptyLine;

        for (int i = 0; i < picture.length; i++) {
            result[i+1] = fillBeginAndEnd(picture[i]);
        }
        return result;
    }

    private static String fillBeginAndEnd(String s) {
        return "*" + s + "*";
    }

    private static String makeEmptyLine(int lineLenght) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < lineLenght; i++) {
            result.append("*");
        }

        return result.toString();
    }
}
