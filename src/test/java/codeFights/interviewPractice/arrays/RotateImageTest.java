package codeFights.interviewPractice.arrays;

import org.junit.Test;

import static codeFights.interviewPractice.arrays.RotateImage.rotateImage;
import static org.assertj.core.api.Assertions.assertThat;

public class RotateImageTest {

    @Test
    public void testOne() {
        int[][] array = new int[][]{{1}};
        int[][] expectedArray = new int[][]{{1}};

        assertThat(rotateImage(array)).isEqualTo(expectedArray);
    }

    @Test
    public void testTwo() {
        int[][] array = new int[][]{{1, 1}};
        int[][] expectedArray = new int[][]{{1}, {1}};

        assertThat(rotateImage(array)).isEqualTo(expectedArray);
    }

    @Test
    public void testThree() {
        int[][] array = new int[][]{{1}, {1}};
        int[][] expectedArray = new int[][]{{1, 1}};

        assertThat(rotateImage(array)).isEqualTo(expectedArray);
    }

    @Test
    public void testFour() {
        int[][] array = new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
        int[][] expectedArray = new int[][]{{7,4,1},{8,5,2},{9,6,3}};

        assertThat(rotateImage(array)).isEqualTo(expectedArray);
    }
}
