package warmup_1.endUp;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static warmup_1.endUp.EndUp.endUp;

public class EndUpTest {

    @Test
    public void testOne() {
        assertThat(endUp("a")).isEqualTo("A");
        assertThat(endUp("ab")).isEqualTo("AB");
        assertThat(endUp("abc")).isEqualTo("ABC");
    }

    @Test
    public void testTwo() {
        assertThat(endUp("abcd")).isEqualTo("abcD");
        assertThat(endUp("abcde")).isEqualTo("abcDE");
        assertThat(endUp("abcdef")).isEqualTo("abcDEF");
    }

    @Test
    public void testThree() {
        assertThat(endUp("hello")).isEqualTo("heLLO");
    }
}