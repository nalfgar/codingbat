package codeFights;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SortByHeightTest {

    @Test
    public void testOne() {
        int[] toSort = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        int[] sorted = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};


        assertThat(SortByHeight.sortByHeight(toSort)).isEqualTo(sorted);
    }
}
