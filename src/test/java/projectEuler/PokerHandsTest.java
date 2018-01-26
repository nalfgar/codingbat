package projectEuler;

import org.junit.Test;
import projectEuler.pokerHands.Hand;

import static junit.framework.TestCase.assertEquals;

public class PokerHandsTest {

    @Test
    public void testGetValueOfHand() {
//        High Card: Highest value card.
//        Hand h1 = new Hand("2C 3D 4H 5S AH");
//        assertEquals(14, h1.getRankOfHand());
//        One Pair: Two cards of the same value.
//        Hand h2 = new Hand("2C 2H 4H 5S AH");
//        assertEquals(114, h2.getRankOfHand());
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
         Hand h6 = new Hand("2C 3H 4H 5S 6H");
        assertEquals(406, h6.getRankOfHand());



    }
}
