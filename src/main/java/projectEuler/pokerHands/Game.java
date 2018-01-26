package projectEuler.pokerHands;

import lombok.Data;

@Data
public class Game {
    private Hand h1;
    private Hand h2;

    public Game(String data1, String data2) {
        h1 = new Hand(data1);
        h2 = new Hand(data2);
    }


    public int whoWins() {
        System.out.println(h1.getRankOfHand());
        System.out.println(h2.getRankOfHand());
        return h1.getRankOfHand() > h2.getRankOfHand() ? 1 : 2;
    }
}
