package codeFights;

import org.junit.Test;

import static codeFights.ReverseParentheses.reverseParentheses;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class ReverseParenthesesTest {

    @Test
    public void testOne() {
        assertThat(reverseParentheses("a(bc)d")).isEqualTo("acbd");
    }

    @Test
    public void testTwo() {
        assertThat(reverseParentheses("a(b(ABC)c)d")).isEqualTo("acABCbd");
    }

    @Test
    public void testThree() {
        assertThat(reverseParentheses("a(bcdefghijkl(mno)p)q")).isEqualTo("apmnolkjihgfedcbq");
    }

    @Test
    public void testFour() {
        assertThat(reverseParentheses("Where are the parentheses?")).isEqualTo("Where are the parentheses?");
    }

    @Test
    public void testFive() {
        assertThat(reverseParentheses("(ba)(dc)")).isEqualTo("abcd");
    }

    @Test
    public void testSix() {
        assertThat(reverseParentheses("The ((quick (brown) (fox) jumps over the lazy) dog)")).isEqualTo("The god quick nworb xof jumps over the lazy");
    }

}
