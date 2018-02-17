package codeFights.smoothSailing;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;

public class SortByHeightTest {

    @Test
    public void testOne() {
        int[] toSort = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        int[] sorted = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};


        Java6Assertions.assertThat(SortByHeight.sortByHeight(toSort)).isEqualTo(sorted);
    }
}
