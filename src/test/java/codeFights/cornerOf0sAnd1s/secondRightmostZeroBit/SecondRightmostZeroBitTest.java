package codeFights.cornerOf0sAnd1s.secondRightmostZeroBit;

import org.junit.Test;

import static codeFights.cornerOf0sAnd1s.secondRightmostZeroBit.SecondRightmostZeroBit.secondRightmostZeroBit;
import static org.assertj.core.api.Assertions.assertThat;

public class SecondRightmostZeroBitTest {

    @Test
    public void testOne() {
        assertThat(secondRightmostZeroBit(4)).isEqualTo(2);
    }

    @Test
    public void testTwo() {
        assertThat(secondRightmostZeroBit(83748)).isEqualTo(2);
    }
}
