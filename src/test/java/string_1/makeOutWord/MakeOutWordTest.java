package string_1.makeOutWord;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeOutWordTest {

    @Test
    public void testOne() {
        assertThat(MakeOutWord.MakeOutWord("<<>>", "Yay")).isEqualTo("<<Yay>>");
            }

    @Test
    public void testTwo() {
        assertThat(MakeOutWord.MakeOutWord("<<>>", "WooHoo")).isEqualTo("<<WooHoo>>");
            }

    @Test
    public void testThree() {
        assertThat(MakeOutWord.MakeOutWord("[[]]", "word")).isEqualTo("[[word]]");
    }

}
