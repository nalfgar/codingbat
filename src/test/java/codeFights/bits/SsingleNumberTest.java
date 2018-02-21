package codeFights.bits;

import org.junit.Test;

import static codeFights.bits.SingleNumber.singleNumber;
import static org.assertj.core.api.Assertions.assertThat;

public class SsingleNumberTest {

    @Test
    public void testOne() {
        assertThat(singleNumber(new int[]{2,2,1})).isEqualTo(1);
    }

    @Test
    public void testTwo() {
        assertThat(singleNumber(new int[]{20,2,20})).isEqualTo(2);
    }
}
