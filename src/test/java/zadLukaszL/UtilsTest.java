package zadLukaszL;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static zadLukaszL.Utils.isPalindrome;
import static zadLukaszL.Utils.isPrime;

public class UtilsTest {

    @Test
    public void testIsPalindrome(){
        assertTrue(isPalindrome(11));
        assertTrue(isPalindrome(1221));
        assertTrue(isPalindrome(12321));
        assertFalse(isPalindrome(1253432147));
    }

    @Test
    public void testIsPrime(){

        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertFalse(isPrime(4));
        assertTrue(isPrime(5));
        assertFalse(isPrime(6));
        assertFalse(isPrime(10));
        assertTrue(isPrime(11));
    }
}
