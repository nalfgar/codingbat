package codeFights.atTheCrossroads.isInfiniteProcess;

public class IsInfiniteProcess {
    public static boolean isInfiniteProcess(int a, int b) {

        if (a > b) {
            return true;
        } else if (a == b){
            return false;
        } else if ((b-a)%2!=0){
            return true;
        }
        return false;
    }
}
