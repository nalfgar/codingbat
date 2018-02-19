package codeFights.rainsOfReason;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlphabeticShiftTest {

    @Test
    public void testOne() {
        assertThat(AlphabeticShift.alphabeticShift("abc")).isEqualTo("bcd");
    }

    @Test
    public void testTwo() {
        assertThat(AlphabeticShift.alphabeticShift("crazy")).isEqualTo("dsbaz");
    }
}
