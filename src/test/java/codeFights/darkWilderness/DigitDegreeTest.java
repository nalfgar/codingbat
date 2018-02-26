package codeFights.darkWilderness;

import org.junit.Test;

import static codeFights.darkWilderness.DigitDegree.digitDegree;
import static org.assertj.core.api.Assertions.assertThat;

public class DigitDegreeTest {

    @Test
    public void testOne() {
        assertThat(digitDegree(5)).isEqualTo(0);
    }


    @Test
    public void testTwo() {
        assertThat(digitDegree(15)).isEqualTo(1);
    }


    @Test
    public void testThree() {
        assertThat(digitDegree(91)).isEqualTo(2);
    }
}
