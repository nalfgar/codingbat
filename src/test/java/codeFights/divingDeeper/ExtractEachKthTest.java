package codeFights.divingDeeper;

import org.junit.Test;

import static codeFights.divingDeeper.ExtractEachKth.extractEachKth;
import static org.assertj.core.api.Assertions.assertThat;

public class ExtractEachKthTest {

    @Test
    public void testZero() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = new int[]{};
        int k = 1;

        assertThat(extractEachKth(inputArray, k)).isEqualTo(expectedArray);
    }

    @Test
    public void testOne() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = new int[]{1, 2, 4, 5, 7, 8, 10};
        int k = 3;

        assertThat(extractEachKth(inputArray, k)).isEqualTo(expectedArray);
    }

    @Test
    public void testTwo() {
        int[] inputArray = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        int[] expectedArray = new int[]{1, 1, 1, 1};
        int k = 2;

        assertThat(extractEachKth(inputArray, k)).isEqualTo(expectedArray);
    }

    @Test
    public void testThree() {
        int[] inputArray = new int[]{1, 2};
        int[] expectedArray = new int[]{1};
        int k = 2;

        assertThat(extractEachKth(inputArray, k)).isEqualTo(expectedArray);
    }

    @Test
    public void testFour() {
        int[] inputArray = new int[]{1, 2};
        int[] expectedArray = new int[]{1, 2};
        int k = 5;

        assertThat(extractEachKth(inputArray, k)).isEqualTo(expectedArray);
    }
}
