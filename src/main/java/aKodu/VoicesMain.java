package aKodu;

import java.util.ArrayList;
import java.util.List;

public class VoicesMain {
    public static void main(String[] args) {
        List<Voice> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Dog());
            list.add(new Cat());
            list.add(new Mouse());
        }
        for (Voice v : list) {
           v.giveVoice();
        }

    }
}
