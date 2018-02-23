package codeFights.divingDeeper;

import org.junit.Test;

import static codeFights.divingDeeper.ArrayMaxConsecutiveSum.arrayMaxConsecutiveSum;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMaxConsecutiveSumTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{2, 3, 5, 1, 6};

        assertThat(arrayMaxConsecutiveSum(inputArray, 2)).isEqualTo(8);
    }

    @Test
    public void testTwo() {
        int[] inputArray = new int[]{2,4,10,1};

        assertThat(arrayMaxConsecutiveSum(inputArray, 2)).isEqualTo(14);
    }

    @Test
    public void testThree() {
        int[] inputArray = new int[]{1, 3, 2, 4};

        assertThat(arrayMaxConsecutiveSum(inputArray, 3)).isEqualTo(9);
    }

    @Test
    public void testFour() {
        int[] inputArray = new int[]{3, 2, 1, 1};

        assertThat(arrayMaxConsecutiveSum(inputArray, 1)).isEqualTo(3);
    }
}
