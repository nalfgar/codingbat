package logic1;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class DateFashion {
    private static List<Integer> no = new ArrayList<>();
    private static List<Integer> maybe = new ArrayList<>();



    public static int dateFashionTest(int you, int date) {
        no.add(0);
        no.add(1);
        no.add(2);
        maybe.add(3);
        maybe.add(4);
        maybe.add(5);
        maybe.add(6);
        maybe.add(7);

        if(no.contains(date)){
            return 0;
        } else if (maybe.contains(date)){
            return 1;
        } else {
            return 2;
        }
    }
}
