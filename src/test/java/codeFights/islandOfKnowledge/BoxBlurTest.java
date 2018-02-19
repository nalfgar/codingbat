package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.BoxBlur.boxBlur;
import static org.assertj.core.api.Assertions.assertThat;

public class BoxBlurTest {

    @Test
    public void testOne() {
        int[][] image = new int[][]{{1,1,1}, {1,7,1}, {1,1,1}};
        int[][] blured = new int[][]{{1}};


        assertThat(boxBlur(image)).isEqualTo(blured);
    }

    @Test
    public void testTwo() {
        int[][] image = new int[][]{{0,18,9}, {27,9,0}, {81,63,45}};
        int[][] blured = new int[][]{{28}};


        assertThat(boxBlur(image)).isEqualTo(blured);
    }

    @Test
    public void testThree() {
        int[][] image = new int[][]{{36,0,18,9}, {27,54,9,0}, {81,63,72,45}};
        int[][] blured = new int[][]{{40,30}};


        assertThat(boxBlur(image)).isEqualTo(blured);
    }
}
