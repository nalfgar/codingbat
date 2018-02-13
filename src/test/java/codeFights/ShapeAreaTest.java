package codeFights;

import org.junit.Test;

import static codeFights.ShapeArea.shapeArea;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class ShapeAreaTest {

    @Test
    public void testOne() {
        assertThat(shapeArea(1)).isEqualTo(1);
    }

    @Test
    public void testTwo() {
        assertThat(shapeArea(2)).isEqualTo(5);
    }

    @Test
    public void testThree() {
        assertThat(shapeArea(3)).isEqualTo(13);
    }
}
