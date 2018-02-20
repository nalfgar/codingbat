package codeFights.atTheCrossroads.willYou;

import org.junit.Test;

import static codeFights.atTheCrossroads.willYou.WillYou.willYou;
import static org.assertj.core.api.Assertions.assertThat;

public class WillYouTest {

    @Test
    public void testOne() {
        assertThat(willYou(true, true, true)).isFalse();
    }

    @Test
    public void testTwo() {
        assertThat(willYou(true, false, true)).isTrue();
    }

    @Test
    public void testThree() {
        assertThat(willYou(false, false, false)).isFalse();
    }

    @Test
    public void testFour() {
        assertThat(willYou(false, false, true)).isTrue();
    }
}
