package codeFights.cornerOf0sAnd1s.rangeBitCount;

import org.junit.Test;

import static codeFights.cornerOf0sAnd1s.rangeBitCount.RangeBitCount.rangeBitCount;
import static org.assertj.core.api.Assertions.assertThat;

public class RangeBitCountTest {

    @Test
    public void testOne() {
        assertThat(rangeBitCount(0, 1)).isEqualTo(1);
    }

    @Test
    public void testTwo() {
        assertThat(rangeBitCount(2, 7)).isEqualTo(11);
    }

    @Test
    public void testThree() {
        assertThat(rangeBitCount(1, 10)).isEqualTo(17);
    }
}
