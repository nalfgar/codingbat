package projectEuler.pokerHands;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Hand {
    private Map<String, Integer> orderCodeMap = new HashMap<>();
    private Map<String, Integer> rankOfHandMap = new HashMap<>();
    private Multimap<Integer, String> multimap = ArrayListMultimap.create();
    private int rankOfHand = 0;

    private void fillOrderCode() {
        orderCodeMap.put("2", 2);
        orderCodeMap.put("3", 3);
        orderCodeMap.put("4", 4);
        orderCodeMap.put("5", 5);
        orderCodeMap.put("6", 6);
        orderCodeMap.put("7", 7);
        orderCodeMap.put("8", 8);
        orderCodeMap.put("9", 9);
        orderCodeMap.put("T", 10);
        orderCodeMap.put("J", 11);
        orderCodeMap.put("Q", 12);
        orderCodeMap.put("K", 13);
        orderCodeMap.put("A", 14);
    }

    private void fillRankOfHand() {
        rankOfHandMap.put("High Card", 0);
        rankOfHandMap.put("One Pair", 100);
        rankOfHandMap.put("Two Pairs", 200);
        rankOfHandMap.put("Three of a Kind", 300);
        rankOfHandMap.put("Straight", 400);
        rankOfHandMap.put("Flush", 500);
        rankOfHandMap.put("Full House", 600);
        rankOfHandMap.put("Four of a Kind", 700);
        rankOfHandMap.put("Straight Flush", 800);
        rankOfHandMap.put("Royal Flush", 900);
    }


    public Hand(String data) {
        fillOrderCode();
        String[] stringData = data.split("\\s+");
        for (String stringDatum : stringData) {
            multimap.put(orderCodeMap.get(Character.toString(stringDatum.charAt(0))),
                    Character.toString(stringDatum.charAt(1)));
        }
        System.out.println(multimap);
        analize();
        System.out.println(rankOfHand);
    }


    public void analize() {
        switch (multimap.keySet().size()) {
            case 5:
                if (!isStraight()){
                    rankOfHand = getMaxValue();
                } else {
                    rankOfHand = 400 + getMaxValue();
                }
                break;
            case 4:
                rankOfHand = 100 + getMaxValue();
                break;
            case 3:
                if (!areTreeOfKind()) {
                    rankOfHand = 200 + getMaxValue();
                } else {
                    rankOfHand = 300 + getMaxValue();
                }
                break;
        }
    }

    private boolean isStraight() {
        boolean result = false;
        int previous = -1;
        boolean start = true;

        for (Integer integer : multimap.keySet()) {
            if (start){
                start = false;
            } else if (integer == previous + 1){
                result = true;
            } else {
                result = false;
                break;
            }
            previous = integer;
        }

        return result;
    }

    private boolean areTreeOfKind() {
        boolean result = false;
        for (Integer integer : multimap.keySet()) {
            if (multimap.get(integer).size() == 3) {
                result = true;
            }
        }

        return result;
    }

    private int getMaxValue() {
        return multimap.keySet()
                .stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
    }
}
