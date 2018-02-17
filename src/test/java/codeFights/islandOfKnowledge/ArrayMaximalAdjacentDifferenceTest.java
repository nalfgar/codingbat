package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ArrayMaximalAdjacentDifferenceTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{2, 4, 1, 0};

        assertThat(arrayMaximalAdjacentDifference(inputArray)).isEqualTo(3);
    }
}
