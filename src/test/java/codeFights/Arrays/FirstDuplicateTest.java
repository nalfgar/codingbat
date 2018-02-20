package codeFights.Arrays;

import org.junit.Test;

import static codeFights.Arrays.FirstDuplicate.firstDuplicate;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstDuplicateTest {

    @Test
    public void testOne() {
        int[] array = new int[]{2, 3, 3, 1, 5, 2};
        assertThat(firstDuplicate(array)).isEqualTo(3);
    }

    @Test
    public void testTwo() {
        int[] array = new int[]{2, 4, 3, 5, 1};
        assertThat(firstDuplicate(array)).isEqualTo(-1);
    }
}
