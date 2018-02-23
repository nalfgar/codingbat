package codeFights.commonTechniquesBasic;

import org.junit.Test;

import static codeFights.commonTechniquesBasic.ArrayMaxConsecutiveSum2.arrayMaxConsecutiveSum2;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMaxConsecutiveSum2Test {

    @Test
    public void testOne() {
        assertThat(arrayMaxConsecutiveSum2(new int[]{-2, 2, 5, -11, 6})).isEqualTo(7);
    }

    @Test
    public void testTwo() {
        assertThat(arrayMaxConsecutiveSum2(new int[]{-3, -2, -1, -4})).isEqualTo(-1);
    }

    @Test
    public void testThree() {
        assertThat(arrayMaxConsecutiveSum2(new int[]{-3, 2, 1, -4})).isEqualTo(3);
    }
}
