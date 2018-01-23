package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static projectEuler.LongestPalindrome.getMax;
import static projectEuler.LongestPalindrome.getMin;
import static projectEuler.LongestPalindrome.longestPalindrome;

public class LongestPalindromeTest {

    @Test
    public void testGetMin2(){
        assertEquals(10, getMin(2));
    }

    @Test
    public void testGetMax2(){
        assertEquals(99, getMax(2));
    }

    @Test
    public void testGetMin3(){
        assertEquals(100, getMin(3));
    }

    @Test
    public void testGetMax3(){
        assertEquals(999, getMax(3));
    }


    @Test
    public void testLongestPalindrome(){
        assertEquals(9009, longestPalindrome(2));
    }


}
