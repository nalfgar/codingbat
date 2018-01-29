package projectEuler;

import org.junit.Test;
import projectEuler.pokerHands.Game;
import projectEuler.pokerHands.Hand;

import static junit.framework.TestCase.assertEquals;

public class PokerHandsTest {

    @Test
    public void testGetValueOfHand() {
//        High Card: Highest value card.
//        Hand h1 = new Hand("2C 3D 4H 5S AH");
//        assertEquals(14, h1.getRankOfHand());
//        One Pair: Two cards of the same value.
        Hand h2 = new Hand("2C 2H 4H 5S AH");
        assertEquals(114, h2.getRankOfHand());
//        Two Pairs: Two different pairs.
//        Hand h3 = new Hand("2C 2H 4H 4S QH");
//        assertEquals(212, h3.getRankOfHand());
//        Three of a Kind: Three cards of the same value.
//        Hand h4 = new Hand("2C 2H 6H 2S QH");
//        assertEquals(312, h4.getRankOfHand());
//        Straight: All cards are consecutive values.
//        Hand h5 = new Hand("2C 3H 4H 5S 6H");
//        assertEquals(406, h5.getRankOfHand());
//        Flush: All cards of the same suit.
//         Hand h6 = new Hand("3D 6D 7D TD QD");
//        assertEquals(406, h6.getRankOfHand());
//        Full House: Three of a kind and a pair.
//        Hand h7 = new Hand("4C 2H 4H 2S 4S");
//        assertEquals(404, h7.getRankOfHand());
//        Four of a Kind: Four cards of the same value.
//        Hand h8 = new Hand("4H 4D 4S 4C JC");
//        assertEquals(511, h8.getRankOfHand());
//        Straight Flush: All cards are consecutive values of same suit.
//        Hand h9 = new Hand("8H 9H TH JH QH");
//        assertEquals(8500, h9.getRankOfHand());
//        Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
//        Hand h10 = new Hand("TS JS QS KS AS");
//        assertEquals(10000, h10.getRankOfHand());
    }

    @Test
    public void testGame(){

//        Game game1 = new Game("5H 5C 6S 7S KD", "2C 3S 8S 8D TD");
//        assertEquals(2, game1.whoWins());
//
//        Game game2 = new Game("5D 8C 9S JS AC", "2C 5C 7D 8S QH");
//        assertEquals(1, game2.whoWins());

//        Game game3 = new Game("2D 9C AS AH AC", "3D 6D 7D TD QD");
//        assertEquals(2, game3.whoWins());

//        Game game4 = new Game("4D 6S 9H QH QC", "3D 6D 7H QD QS");
//        assertEquals(1, game4.whoWins());

        Game game5 = new Game("2H 2D 4C 4D 4S", "3C 3D 3S 9S 9D");
        assertEquals(1, game5.whoWins());


    }
}
