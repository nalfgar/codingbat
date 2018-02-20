package codeFights.cornerOf0sAnd1s.killKthBit;

import org.junit.Test;

import static codeFights.cornerOf0sAnd1s.killKthBit.KillKthBit.killKthBit;
import static org.assertj.core.api.Assertions.assertThat;

public class KillKthBitTest {

    @Test
    public void testOne() {
        assertThat(killKthBit(37, 3)).isEqualTo(33);
    }

    @Test
    public void testTwo() {
        assertThat(killKthBit(0, 3)).isEqualTo(0);
    }

    @Test
    public void testFive() {
        assertThat(killKthBit(1, 1)).isEqualTo(0);
    }
}
