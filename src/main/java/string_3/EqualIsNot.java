package string_3;

public class EqualIsNot {


    public static boolean equalIsNot(String str) {

        return countChanges(str, "is") == countChanges(str, "not");
    }

    private static int countChanges(String base, String replacement) {
        int counter = 0;

        while (base.contains(replacement)){
            base = base.replaceFirst(replacement, "*");
            counter++;
        }

        return counter;
    }
}
