package projectEuler.pokerHands;

import lombok.Data;

@Data
public class Game {
    private Hand h1;
    private Hand h2;

    public Game(String data) {
        h1 = new Hand(data.substring(0, 14));
        h2 = new Hand(data.substring(15, data.length()));
    }


    public int whoWins() {
        System.out.println(h1.getMultimap() + "\t" + h2.getMultimap() + "\t" + "***" + h1.getRankOfHand() + "\t" +h2.getRankOfHand());
        return h1.getRankOfHand() > h2.getRankOfHand() ? 1 : 2;
    }
}
