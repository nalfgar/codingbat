package warmup_2.arrayCount9;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static warmup_2.arrayCount9.ArrayCount9.arrayCount9;

public class arrayCount9Test {

    @Test
    public void testOne() {
        assertThat(arrayCount9(new int[]{1, 2, 9})).isEqualTo(1);
    }

    @Test
    public void testTwo() {
        assertThat(arrayCount9(new int[]{1, 9, 9})).isEqualTo(2);
    }

    @Test
    public void testThree() {
        assertThat(arrayCount9(new int[]{1, 9, 9, 3, 9})).isEqualTo(3);
    }
}
