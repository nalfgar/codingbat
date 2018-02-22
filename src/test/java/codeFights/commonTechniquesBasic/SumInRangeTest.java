package codeFights.commonTechniquesBasic;

import org.junit.Test;

import static codeFights.commonTechniquesBasic.SumInRange.sumInRange;
import static org.assertj.core.api.Assertions.assertThat;

public class SumInRangeTest {

    @Test
    public void testOne() {
        assertThat(sumInRange(new int[]{3,0,-2,6,-3,2}, new int[][]{{0,2},{2,5},{0,5}})).isEqualTo(10);
    }

    @Test
    public void testTwo() {
        assertThat(sumInRange(new int[]{-1000}, new int[][]{{0,0}})).isEqualTo(999999007);
    }
}
