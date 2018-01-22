package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static projectEuler.tools.Palindrome.isDoubleBasePalindrome;

public class DoubleBasePalindromesTest {

    @Test
    public void testOne(){
        assertEquals(false, isDoubleBasePalindrome(13));
    }

    @Test
    public void testTwo(){

        assertEquals(true, isDoubleBasePalindrome(585));
    }
}
