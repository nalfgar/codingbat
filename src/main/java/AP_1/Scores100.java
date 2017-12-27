package AP_1;

public class Scores100 {

    public static boolean scores100(int[] ints) throws Exception {
        if (ints.length < 2){
            throw new Exception("Array lenght have to be more than 2");
        }
        boolean result = false;
        for (int i = 0; i < ints.length-1; i++) {
            if(ints[i] == 100 && (ints[i] == ints[i+1])){
                result = true;
                break;
            }
        }
        return result;
    }
}
