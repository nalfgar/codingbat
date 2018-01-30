package projectEuler;

import org.junit.Test;
import projectEuler.pokerHands.Game;
import projectEuler.pokerHands.Hand;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PokerHandsTest {

    @Test
    public void testGetValueOfHandForHighCard() {
//        High Card: Highest value card.
        Hand hand1 = new Hand("2C 3D 4H 5S AH");
        Hand hand3 = new Hand("2C 3D 4H 5S KH");

        assertEquals(0, hand1.getTypeOfHand());
        assertEquals(0, hand3.getTypeOfHand());

        assertTrue(hand1.getRankOfHand() > hand3.getRankOfHand());
    }

    @Test
    public void testGetValueOfHandForOnePair() {
//        One Pair: Two cards of the same value.
        Hand hand1 = new Hand("5H 5C 6S 7S KD");
        Hand hand2 = new Hand("2H 5C 6S KS KD");

        assertEquals(1, hand1.getTypeOfHand());
        assertEquals(1, hand2.getTypeOfHand());

        assertFalse(hand1.wins(hand2));
    }

    @Test
    public void testGetValueOfHandForTwoPairs() {
//        Two Pairs: Two different pairs.
        Hand hand1 = new Hand("2C 2H 4H 4S QH");
        Hand hand2 = new Hand("3C 3H AH AS QH");

        assertEquals(2, hand1.getTypeOfHand());
        assertEquals(2, hand2.getTypeOfHand());

        assertFalse(hand1.wins(hand2));
    }

    @Test
    public void testGetValueOfHandForThreeOfAKind() {
//        Three of a Kind: Three cards of the same value.
        Hand hand1 = new Hand("2C 2H 2H AS KH");
        Hand hand2 = new Hand("3C 3H 3H 4S 5H");

        assertEquals(3, hand1.getTypeOfHand());
        assertEquals(3, hand2.getTypeOfHand());

        assertFalse(hand1.wins(hand2));

    }

    @Test
    public void testGetValueOfHandForStraight() {
//        Straight: All cards are consecutive values.
        Hand hand1 = new Hand("2C 3H 4H 5S 6H");
        Hand hand2 = new Hand("2H 3C 4S 5H 6C");
        Hand hand3 = new Hand("9H 8C 7S 6D TC");

        assertEquals(4, hand1.getTypeOfHand());
        assertEquals(4, hand2.getTypeOfHand());
        assertEquals(4, hand3.getTypeOfHand());

        assertTrue(hand3.wins(hand2));
        assertFalse(hand1.wins(hand3));
    }

    @Test
    public void testGetValueOfHandForFlush() {
//        Flush: All cards of the same suit.
        Hand hand1 = new Hand("3D 6D 7D TD QD");
        Hand hand2 = new Hand("4S 6S 7S TS QS");

        assertEquals(5, hand1.getTypeOfHand());
        assertEquals(5, hand2.getTypeOfHand());
        assertTrue(hand2.wins(hand1));
    }

    @Test
    public void testGetValueOfHandForFullHouse() {
//        Full House: Three of a kind and a pair.
        Hand hand1 = new Hand("4C 2H 4H 2S 4S");
        Hand hand2 = new Hand("5C 3H 5H 3S 5S");

        assertEquals(6, hand1.getTypeOfHand());
        assertEquals(6, hand2.getTypeOfHand());
        assertFalse(hand1.wins(hand2));
    }

    @Test
    public void testGetValueOfHandForFourOfKinf() {
//        Four of a Kind: Four cards of the same value.
        Hand hand1 = new Hand("4H 4D 4S 4C JC");
        Hand hand2 = new Hand("5H 5D 5S 5C AC");

        assertEquals(7, hand1.getTypeOfHand());
        assertEquals(7, hand2.getTypeOfHand());
        assertFalse(hand1.wins(hand2));
    }

    @Test
    public void testGetValueOfHandForStraightFlush() {

//        Straight Flush: All cards are consecutive values of same suit.
        Hand hand1 = new Hand("8H 9H TH JH QH");
        Hand hand2 = new Hand("9C TC JC QC KC");

        assertEquals(8, hand1.getTypeOfHand());
        assertEquals(8, hand2.getTypeOfHand());
        assertTrue(hand2.wins(hand1));
    }

    @Test
    public void testGetValueOfHandForRoyalFlush() {

//        Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
        Hand hand1 = new Hand("TS JS QS KS AS");
        Hand hand2 = new Hand("9C TC JC QC KC");

        assertEquals(9, hand1.getTypeOfHand());
        assertEquals(8, hand2.getTypeOfHand());
        assertTrue(hand1.wins(hand2));
    }

    @Test
    public void testGame() {

        Game game1 = new Game("5H 5C 6S 7S KD 2C 3S 8S 8D TD");
        assertEquals(2, game1.whoWins());

        Game game2 = new Game("5D 8C 9S JS AC 2C 5C 7D 8S QH");
        assertEquals(1, game2.whoWins());
//
        Game game3 = new Game("2D 9C AS AH AC 3D 6D 7D TD QD");
        assertEquals(2, game3.whoWins());
//
        Game game4 = new Game("4D 6S 9H QH QC 3D 6D 7H QD QS");
        assertEquals(1, game4.whoWins());
//
        Game game5 = new Game("2H 2D 4C 4D 4S 3C 3D 3S 9S 9D");
        assertEquals(1, game5.whoWins());

        Game game6 = new Game("8C TS KC 9H 4S 7D 2S 5D 3S AC");
        assertEquals(2, game6.whoWins());
    }
}
