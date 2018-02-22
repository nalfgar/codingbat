package codeFights.commonTechniquesBasic;

import org.junit.Test;

import static codeFights.commonTechniquesBasic.SumOfTwo.sumOfTwo;
import static org.assertj.core.api.Assertions.assertThat;

public class SumOfTwoTest {

    @Test
    public void testOne() {
        assertThat(sumOfTwo(new int[]{1,2,3}, new int[]{10,20,30,40}, 42)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(sumOfTwo(new int[]{1,2,3}, new int[]{10,20,30}, 42)).isFalse();
    }
}
