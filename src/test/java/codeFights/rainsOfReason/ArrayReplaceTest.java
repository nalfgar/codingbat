package codeFights.rainsOfReason;

import org.junit.Test;

import static codeFights.rainsOfReason.ArrayReplace.arrayReplace;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayReplaceTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{1,2,1};
        int[] expectedArray = new int[]{3,2,3};

        assertThat(arrayReplace(inputArray, 2, 3)).isEqualTo(expectedArray);
    }
}
