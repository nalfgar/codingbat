package codeFights.darkWilderness;

import org.junit.Test;

import static codeFights.darkWilderness.GrowingPlant.growingPlant;
import static org.assertj.core.api.Assertions.assertThat;

public class GrowingPlantTest {

    @Test
    public void testOne() {
        assertThat(growingPlant(100, 10, 910)).isEqualTo(10);
    }

    @Test
    public void testTwo() {
        assertThat(growingPlant(10, 9, 4)).isEqualTo(1);
    }


    @Test
    public void testThree() {
        assertThat(growingPlant(5, 2, 7)).isEqualTo(2);
    }
}
