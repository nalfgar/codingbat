package codeFights.smoothSailing;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;

public class AllLongestStringsTest {

    @Test
    public void testOne() {
        String[] inputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};
        String[] outputArray = new String[]{"aba", "vcd", "aba"};


        Java6Assertions.assertThat(AllLongestStrings.allLongestStrings(inputArray)).isEqualTo(outputArray);
    }
}
