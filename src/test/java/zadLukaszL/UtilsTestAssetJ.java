package zadLukaszL;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static zadLukaszL.Utils.isPalindrome;
import static zadLukaszL.Utils.isPrime;

public class UtilsTestAssetJ {

    @Test
    public void testIsPalindrome(){
        assertThat(isPalindrome(11)).isTrue();
        assertThat(isPalindrome(113)).isFalse();
        assertThat(isPalindrome(1221)).isTrue();
        assertThat(isPalindrome(12219)).isFalse();
        assertThat(isPalindrome(12321)).isTrue();
    }

    @Test
    public void testIsPrime(){
        assertThat(isPrime(2)).isTrue();
        assertThat(isPrime(3)).isTrue();
        assertThat(isPrime(4)).isFalse();
        assertThat(isPrime(5)).isTrue();
        assertThat(isPrime(6)).isFalse();
        assertThat(isPrime(7)).isTrue();
        assertThat(isPrime(8)).isFalse();
        assertThat(isPrime(9)).isFalse();
        assertThat(isPrime(10)).isFalse();
        assertThat(isPrime(11)).isTrue();
        assertThat(isPrime(12)).isFalse();
    }
}
