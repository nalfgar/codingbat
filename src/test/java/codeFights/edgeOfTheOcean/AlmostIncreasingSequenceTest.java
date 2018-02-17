package codeFights.edgeOfTheOcean;

import org.junit.Test;

import static codeFights.edgeOfTheOcean.AlmostIncreasingSequence.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class AlmostIncreasingSequenceTest {

    @Test
    public void testTwo() {
        int[] sequence = new int[]{1, 2};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testThree() {
        int[] sequence = new int[]{1, 2, 3};

        assertThat(almostIncreasingSequence(sequence)).isFalse();
    }

    @Test
    public void testFour() {
        int[] sequence = new int[]{10, 2, 3, 4};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testFive() {
        int[] sequence = new int[]{2, 3, 4, 111, 5};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }


    @Test
    public void testSix() {
        int[] sequence = new int[]{1, 2, 5, 3, 5};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }

    @Test
    public void testSeven() {
        int[] sequence = new int[]{1, 2, 3, 4, 3, 6};

        assertThat(almostIncreasingSequence(sequence)).isTrue();
    }



    @Test
    public void testX() {
        int[] sequenceIn = new int[]{2, 3, 4, 5, 6, 7};
        int[] sequenceOut = new int[]{2, 3, 5, 6, 7};

        assertThat(makeSequenceWithoutIndex(sequenceIn, 2)).isEqualTo(sequenceOut);
    }

}
