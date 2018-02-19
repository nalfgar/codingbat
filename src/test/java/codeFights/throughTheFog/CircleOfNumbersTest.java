package codeFights.throughTheFog;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircleOfNumbersTest {

    @Test
    public void testOne() {
        assertThat(CircleOfNumbers.circleOfNumbers(10, 2)).isEqualTo(7);
    }

    @Test
    public void testTwo() {
        assertThat(CircleOfNumbers.circleOfNumbers(10, 7)).isEqualTo(2);
    }

    @Test
    public void testThree() {
        assertThat(CircleOfNumbers.circleOfNumbers(4, 1)).isEqualTo(3);
    }
}
