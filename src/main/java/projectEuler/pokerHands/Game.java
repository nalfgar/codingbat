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
        if (h1.getTypeOfHand() > h2.getTypeOfHand()){
            return 1;
        } else {
            if (h1.getRankOfHand() > h2.getRankOfHand()){
                return 1;
            }
        }
        return 2;
    }
}
