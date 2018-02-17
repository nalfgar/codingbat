package codeFights.exploringTheWaters;

import org.junit.Test;

import static codeFights.exploringTheWaters.PalindromeRearranging.palindromeRearranging;
import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeRearrangingTest {

    @Test
    public void testOne() {
        assertThat(palindromeRearranging("aabb")).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc")).isFalse();
    }

    @Test
    public void testThree() {
        assertThat(palindromeRearranging("azz")).isTrue();
    }


}
