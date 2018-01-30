package projectEuler.pokerHands;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Hand {
    private Map<String, Integer> orderCodeMap = new HashMap<>();
    private Multimap<Integer, String> multimap = ArrayListMultimap.create();
    private int rankOfHand = 0;
    private int typeOfHand = 0;

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
//        System.out.println(multimap);

    }


    public void analize() {
        switch (multimap.keySet().size()) {
            case 5:
                if (isTheSameSuit() && isRoyalFlush()) {
                    typeOfHand = 10;
                    rankOfHand = 10000;
                } else if (isTheSameSuit() && isStraight()) {
                    typeOfHand = 8;
                    rankOfHand = 8000 + getMaxStraight();
                } else if (isTheSameSuit()) {
                    typeOfHand = 5;
                    rankOfHand = 5000 + getMaxOfCard();
                } else if (isStraight()) {
                    typeOfHand = 4;
                    rankOfHand = 4000 + getMaxOfCard();
                } else {
                    typeOfHand = 0;
                    rankOfHand = getMAxOfHighCard();
                }
                break;
            case 4:
                typeOfHand = 1;
                rankOfHand = 1000 + getMaxOfOnePair();
                break;
            case 3:
                if (isThreeOfKind()) {
                    typeOfHand = 3;
                    rankOfHand = 3000 + getMaxOfThreeOfKind();
                } else {
                    typeOfHand = 2;
                    rankOfHand = 2000 + getMaxOfTwoPairs();
                }
                break;
            case 2:
                if (isFourOfKind()) {
                    typeOfHand = 7;
                    rankOfHand = 7000 + getMaxFourOfKind();
                } else {
                    typeOfHand = 6;
                    rankOfHand = 6000 + getMaxOfFoulHouse();
                }
                break;
        }
    }

    private int getMAxOfHighCard() {
        int sum = 0;
        int counter = 0;
        Set<Integer> keysSet = multimap.keySet();
        keysSet = keysSet.stream().sorted().collect(Collectors.toSet());
        for (Integer key : keysSet) {
            sum += Math.pow(key, counter);
            counter++;
        }
        return sum;
    }

    private int getMaxOfOnePair() {
        int sum = 0;
        int max;
        int min;
        List<Integer> notPair = new ArrayList<>();

        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 2) {
                sum += key * 100;
            } else {
                notPair.add(key);
            }
        }
        notPair.sort(Comparator.naturalOrder());
        sum += notPair.get(2) * 60;
        sum += notPair.get(0) * 20;
        sum += notPair.get(1);
        return sum;
    }

    private int getMaxOfTwoPairs() {
        int sum = 0;
        List<Integer> pairs = new ArrayList<>();

        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 2) {
                pairs.add(key);
            } else {
                sum += key;
            }
        }
        sum += pairs.stream().max(Comparator.naturalOrder()).get() * 100;
        sum += pairs.stream().min(Comparator.naturalOrder()).get() * 10;
        return sum;
    }

    private int getMaxOfThreeOfKind() {
        int sum = 0;
        List<Integer> notThree = new LinkedList<>();

        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 3) {
                sum += key * 100;
            } else if (multimap.get(key).size() == 1) {
                notThree.add(key);
            }
        }
        sum += notThree.stream().max(Comparator.naturalOrder()).get() * 10;
        sum += notThree.stream().min(Comparator.naturalOrder()).get();
        return sum;
    }

    private boolean isThreeOfKind() {

        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 3) {
                return true;
            }
        }
        return false;
    }

    private Integer getMaxOfCard() {
        return multimap.keySet()
                .stream()
                .max(Comparator.naturalOrder())
                .get();
    }

    private int getMaxOfFoulHouse() {
        int sum = 0;
        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 3) {
                sum += key * 10;
            } else {
                sum += key;
            }
        }
        return sum;
    }

    private int getMaxFourOfKind() {
        int sum = 0;
        for (Integer key : multimap.keySet()) {
            if (multimap.get(key).size() == 4) {
                sum += key * 10;
            } else {
                sum += key;
            }
        }
        return sum;
    }

    private boolean isFourOfKind() {
        List<Integer> quantities = new ArrayList<>();

        for (Integer key : multimap.keySet()) {
            quantities.add(multimap.get(key).size());
        }
        return (quantities.get(0) == 1 && quantities.get(1) == 4)
                || (quantities.get(0) == 4 && quantities.get(1) == 1);
    }

    private Integer getMaxStraight() {
        return multimap.keySet().stream().max(Comparator.naturalOrder()).get();
    }

    private boolean isTheSameSuit() {
        Set<String> suits = new HashSet<>();
        suits.addAll(multimap.values());

        return suits.size() == 1;
    }

    private boolean isStraight() {
        int previous = 0;
        boolean start = true;

        for (Integer cardValue : multimap.keySet()) {
            if (start) {
                start = false;
                previous = cardValue;
                continue;
            } else {
                if (cardValue != previous + 1) {
                    return false;
                }
            }
            previous = cardValue;
        }
        return true;
    }

    private boolean isRoyalFlush() {
        int[] royalFlush = new int[]{10, 11, 12, 13, 14};

        for (int card : royalFlush) {
            if (!multimap.keySet().contains(card)) {
                return false;
            }
        }

        return true;
    }
}
