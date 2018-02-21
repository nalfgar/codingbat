package codeFights.bits;

import org.junit.Test;

import static codeFights.bits.InsertBits.insertBits;
import static org.assertj.core.api.Assertions.assertThat;

public class InsertBitsTest {

    @Test
    public void testOne() {
        assertThat(insertBits(1024,1,6,17)).isEqualTo(1058);
    }

    @Test
    public void testTwo() {
        assertThat(insertBits(11,1,2,2)).isEqualTo(13);
    }

}
