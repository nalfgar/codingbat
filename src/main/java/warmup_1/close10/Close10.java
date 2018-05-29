package warmup_1.close10;

public class Close10 {

    public static int Close10(int a, int b) {
        int Amin10 = Math.abs(a - 10);
        int Bmin10 = Math.abs(b - 10);

        if (Amin10 == Bmin10) {
            return 0;
        } else if (Amin10 > Bmin10){
            return b;
        } else return a;

    }
}
