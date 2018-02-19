package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.AvoidObstacles.avoidObstacles;
import static org.assertj.core.api.Assertions.assertThat;

public class AvoidObstaclesTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{1};

        assertThat(avoidObstacles(inputArray)).isEqualTo(2);
    }

    @Test
    public void testTwo() {
        int[] inputArray = new int[]{1,2};

        assertThat(avoidObstacles(inputArray)).isEqualTo(3);
    }

    @Test
    public void testThree() {
        int[] inputArray = new int[]{1,2,3};

        assertThat(avoidObstacles(inputArray)).isEqualTo(4);
    }

    @Test
    public void testFour() {
        int[] inputArray = new int[]{4,1,2};

        assertThat(avoidObstacles(inputArray)).isEqualTo(3);
    }

    @Test
    public void testFive() {
        int[] inputArray = new int[]{4,1,2, 5};

        assertThat(avoidObstacles(inputArray)).isEqualTo(3);
    }

    @Test
    public void testTen() {
        int[] inputArray = new int[]{5,3,6,7,9};

        assertThat(avoidObstacles(inputArray)).isEqualTo(4);
    }
}
