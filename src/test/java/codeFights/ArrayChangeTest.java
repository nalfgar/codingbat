package codeFights;

import org.junit.Test;

import static codeFights.ArrayChange.arrayChange;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayChangeTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{1,1,1};

        assertThat(arrayChange(inputArray)).isEqualTo(3);
    }

    @Test
    public void testTwo() {
        int[] inputArray = new int[]{-1000,0,-2, 0};

        assertThat(arrayChange(inputArray)).isEqualTo(5);
    }

    @Test
    public void testThree() {
        int[] inputArray = new int[]{2, 1, 10, 1};

        assertThat(arrayChange(inputArray)).isEqualTo(12);
    }

    @Test
    public void testfour() {
        int[] inputArray = new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};

        assertThat(arrayChange(inputArray)).isEqualTo(13);
    }


}
