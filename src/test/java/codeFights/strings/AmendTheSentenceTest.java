package codeFights.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AmendTheSentenceTest {

    @Test
    public void testZero() {
        assertThat(AmendTheSentence.amendTheSentence("")).isEqualTo("");
    }

    @Test
    public void testOne() {
        assertThat(AmendTheSentence.amendTheSentence("CodefightsIsAwesome")).isEqualTo("codefights is awesome");
    }

    @Test
    public void testTwo() {
        assertThat(AmendTheSentence.amendTheSentence("Hello")).isEqualTo("hello");
    }


}
