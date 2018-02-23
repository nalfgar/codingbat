package codeFights.divingDeeper;

import org.junit.Test;

import static codeFights.divingDeeper.FirstDigit.firstDigit;
import static org.assertj.core.api.Assertions.assertThat;

public class TirstDigitTest {

    @Test
    public void testOne() {
        assertThat(firstDigit("var_1__Int")).isEqualTo('1');
    }

    @Test
    public void testTwo() {
        assertThat(firstDigit("q2q-q")).isEqualTo('2');
    }

    @Test
    public void testThree() {
        assertThat(firstDigit("0ss")).isEqualTo('0');
    }


}
