package codeFights.rainsOfReason;

public class VariableName {
    public static boolean variableName(String name) {
        String allAlphabet = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM1234567890_";
        String numbersAlphabet = "1234567890";

        if (numbersAlphabet.contains(String.valueOf(name.charAt(0)))){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!allAlphabet.contains(String.valueOf(name.charAt(i)))){
                return false;
            }
        }

        return true;
    }
}
