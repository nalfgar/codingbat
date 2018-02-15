package codeFights;


public class ReverseParentheses {
    public static String reverseParentheses(String s) {
        String result = s;
        int firstP;
        int lastP;

        while (s.contains("(")) {
            s = flipStringInParentheses(s);
        }

        return s;
    }

    private static String flipStringInParentheses(String s) {
        InnerIndexes innerIndexes = new InnerIndexes(s);
        String result = "";

        result = s.substring(0, innerIndexes.beginIndex);
        for (int i = innerIndexes.endIndex-1; i > innerIndexes.beginIndex; i--) {
            result += String.valueOf(s.charAt(i));
        }

        result += s.substring(innerIndexes.endIndex + 1, s.length());
        s = result;
        System.out.println(s);
        return s;
    }

    private static class InnerIndexes {
        int beginIndex;
        int endIndex;
//        TODO check between beginInddex and endIndex is ) or (

        public InnerIndexes(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    endIndex = i;
                    break;
                }
            }
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) == '(') {
                    beginIndex = i;
                    break;
                }
            }
        }
    }
}
