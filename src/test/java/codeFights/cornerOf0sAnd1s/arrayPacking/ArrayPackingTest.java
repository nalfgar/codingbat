package codeFights.cornerOf0sAnd1s.arrayPacking;

import org.junit.Test;

import static codeFights.cornerOf0sAnd1s.arrayPacking.ArrayPacking.arrayPacking;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayPackingTest {

    @Test
    public void testZero() {
        assertThat(arrayPacking(new int[]{0, 0, 0})).isEqualTo(0);
    }

    @Test
    public void testOne() {
        assertThat(arrayPacking(new int[]{24, 85, 0})).isEqualTo(21784);
    }

    @Test
    public void testTwo() {
        assertThat(arrayPacking(new int[]{23, 45, 39})).isEqualTo(2567447);
    }
}
