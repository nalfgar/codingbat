package codeFights;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AllLongestStringsTest {

    @Test
    public void testOne() {
        String[] inputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};
        String[] outputArray = new String[]{"aba", "vcd", "aba"};


        assertThat(AllLongestStrings.allLongestStrings(inputArray)).isEqualTo(outputArray);
    }
}
