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
        return h1.wins(h2) ? 1 : 2;
    }
}
