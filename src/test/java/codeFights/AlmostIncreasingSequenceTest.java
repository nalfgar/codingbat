package codeFights;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static codeFights.AlmostIncreasingSequence.almostIncreasingSequence;
import static codeFights.AlmostIncreasingSequence.isStrictlyIncreasingSequence;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class AlmostIncreasingSequenceTest {

    @Test
    public void testTwo() {
        int[] sequence = new int[]{1, 2};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testThree() {
        int[] sequence = new int[]{1, 3, 2};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testTFour() {
        int[] sequence = new int[]{0, -2, 5, 6};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }


    @Test
    public void testFourFalse() {
        int[] sequence = new int[]{1, 3, 2, 1};

        assertThat(almostIncreasingSequence(sequence)).isFalse();
    }

    @Test
    public void testFourTrue() {
        int[] sequence = new int[]{1, 3, 2, 3};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testFive() {
        int[] sequence = new int[]{1, 2, 1, 2};

        assertThat(almostIncreasingSequence(sequence)).isFalse();
    }




    @Test
    public void testTwoElementsIncreasingList() {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);

        assertThat(isStrictlyIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testThreeElementsIncreasingList() {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);

        assertThat(isStrictlyIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testThreElementsNotIncreasingList() {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(5);
        sequence.add(3);

        assertThat(isStrictlyIncreasingSequence(sequence)).isFalse();
    }

}
