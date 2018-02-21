package codeFights.cornerOf0sAnd1s.mirrorBits;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MirrorBitsTest {

    @Test
    public void testOne() {
        assertThat(MirrorBits.mirrorBits(0)).isEqualTo(0);
    }

    @Test
    public void testTwo() {
        assertThat(MirrorBits.mirrorBits(1)).isEqualTo(1);
    }

    @Test
    public void testThree() {
        assertThat(MirrorBits.mirrorBits(2)).isEqualTo(1);
    }

    @Test
    public void testFour() {
        assertThat(MirrorBits.mirrorBits(97)).isEqualTo(67);
    }
}
