package codeFights.darkWilderness;

import org.junit.Test;

import static codeFights.darkWilderness.LongestDigitsPrefix.longestDigitsPrefix;
import static org.assertj.core.api.Assertions.assertThat;

public class LongestDigitsPrefixTest {

    @Test
    public void testOne() {
        assertThat(longestDigitsPrefix("123aa1")).isEqualTo("123");
    }

    @Test
    public void testTwo() {
        assertThat(longestDigitsPrefix("0123456789")).isEqualTo("0123456789");
    }
}
