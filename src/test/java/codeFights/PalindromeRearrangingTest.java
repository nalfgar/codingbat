package codeFights;

import org.junit.Test;

import static codeFights.PalindromeRearranging.palindromeRearranging;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

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
