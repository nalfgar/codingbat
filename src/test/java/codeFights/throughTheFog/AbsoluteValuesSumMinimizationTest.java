package codeFights.throughTheFog;

import org.junit.Test;

import static codeFights.throughTheFog.AbsoluteValuesSumMinimization.absoluteValuesSumMinimization;
import static org.assertj.core.api.Assertions.assertThat;

public class AbsoluteValuesSumMinimizationTest  {

    @Test
    public void testOne() {
        int[] array = new int[]{2, 4, 7};

        assertThat(absoluteValuesSumMinimization(array)).isEqualTo(4);
    }

    @Test
    public void testTwo() {
        int[] array = new int[]{1,1,3,4};

        assertThat(absoluteValuesSumMinimization(array)).isEqualTo(1);
    }
}
