package codeFights;

import org.junit.Test;

import static codeFights.CommonCharacterCount.commonCharacterCount;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CommonCharacterCountTest {

    @Test
    public void testOne() {
        String s1 = "aabcc";
        String s2 = "adcaa";

        assertThat(commonCharacterCount(s1, s2)).isEqualTo(3);
    }

    @Test
    public void testTwo() {
        String s1 = "zzzz";
        String s2 = "zzzzzzzzzz";

        assertThat(commonCharacterCount(s1, s2)).isEqualTo(4);
    }
}
