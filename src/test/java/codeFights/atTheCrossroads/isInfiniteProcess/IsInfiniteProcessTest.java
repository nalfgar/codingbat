package codeFights.atTheCrossroads.isInfiniteProcess;

import org.junit.Test;

import static codeFights.atTheCrossroads.isInfiniteProcess.IsInfiniteProcess.isInfiniteProcess;
import static org.assertj.core.api.Assertions.assertThat;

public class IsInfiniteProcessTest {

    @Test
    public void testOne() {
        assertThat(isInfiniteProcess(10, 0)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(isInfiniteProcess(10, 10)).isFalse();
    }

    @Test
    public void testThree() {
        assertThat(isInfiniteProcess(2, 5)).isTrue();
    }

    @Test
    public void testFour() {
        assertThat(isInfiniteProcess(2, 4)).isFalse();
    }
}
