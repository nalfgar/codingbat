package codeFights.divingDeeper;

import org.junit.Test;

import static codeFights.divingDeeper.DifferentSymbolsNaive.differentSymbolsNaive;
import static org.assertj.core.api.Assertions.assertThat;

public class DifferentSymbolsNaiveTest {

    @Test
    public void testOne() {
        assertThat(differentSymbolsNaive("cabca")).isEqualTo(3);
    }
}
