package projectEuler.pokerHands;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.*;

@Data
public class Hand {
    private Map<String, Integer> orderCodeMap = new HashMap<>();
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

    public Hand(String data) {
        fillOrderCode();
        String[] stringData = data.split("\\s+");
        for (String stringDatum : stringData) {
            multimap.put(orderCodeMap.get(Character.toString(stringDatum.charAt(0))),
                    Character.toString(stringDatum.charAt(1)));
        }
        analize();
    }


    public void analize() {
        switch (multimap.keySet().size()) {
            case 5:
                if (hasTheSameSuit() && isRoyal()){
                    rankOfHand = 10000;
                } else if (hasTheSameSuit() && isStraight()){
                    rankOfHand = 9000 + 20 * getValueOfHand();
                } else if (hasTheSameSuit()){
                    rankOfHand = 6000 + 12 * getValueOfHand();
                } else if (isStraight()){
                    rankOfHand = 5000 + 10 * getValueOfHand();
                } else {
                    rankOfHand = 2000 + getMaxValue();
                }
                break;
            case 4:
                rankOfHand = 1000 + getMaxValue();
                break;
            case 3:
                if (areTwoPairs()){
                    rankOfHand = 3000 + 6 * getValueOfHand();
                } else {
                    rankOfHand = 4000 + 8 * getValueOfHand();
                }
                break;
            case 2:
                if (areFourOfKind()){
                    rankOfHand = 8000 + 16 * getValueOfHand();
                } else if (isFullHouse()){
                    rankOfHand = 7000 + 14 * getValueOfHand();
                }
                break;
        }
    }

    private boolean areTwoPairs() {
        List<Integer> results = new ArrayList<>();
        for (Integer integer : multimap.keySet()) {
            results.add(multimap.get(integer).size());
        }
        results.sort(Comparator.naturalOrder());
        if (results.get(1) == 2 && results.get(2) == 2){
            return true;
        }
        return false;
    }

    private boolean areFourOfKind() {
        boolean result = false;
        List<Integer> results = new ArrayList<>();

        for (Integer integer : multimap.keySet()) {
            results.add(multimap.get(integer).size());
        }

        if ((results.get(0) == 1 && results.get(1) == 4) || (results.get(0) == 4 && results.get(1) == 1)) {
            result = true;
        }
        return result;
    }

    private int getValueOfHand() {
        int value = 0;
        for (Integer integer : multimap.keys()) {
            value += integer;
        }

        return value;
    }

    private int getMaxValueOfPair() {
        int result = 0;

        for (Integer integer : multimap.keys()) {
            if (multimap.get(integer).size() == 2) {
                result = integer;
            }
        }
        return result;
    }

    private boolean isRoyal() {
        int[] royal = new int[]{10, 11, 12, 13, 14};

        for (int i : royal) {
            if (!multimap.keys().contains(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasTheSameSuit() {
        Set<String> suits = new HashSet<>();
        for (String string : multimap.values()) {
            suits.add(string);
        }
        return suits.size() == 1 ? true : false;
    }

    private boolean isFullHouse() {
        boolean result = false;
        List<Integer> results = new ArrayList<>();

        for (Integer integer : multimap.keySet()) {
            results.add(multimap.get(integer).size());
        }

        if ((results.get(0) == 2 && results.get(1) == 3) || (results.get(0) == 2 && results.get(1) == 3)) {
            result = true;
        }
        return result;
    }

    private boolean isStraight() {
        boolean result = false;
        int previous = -1;
        boolean start = true;

        for (Integer integer : multimap.keySet()) {
            if (start) {
                start = false;
            } else if (integer == previous + 1) {
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
