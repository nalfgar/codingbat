package codeFights.rainsOfReason;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenDigitsOnlyTest {

    @Test
    public void testOne() {
        assertThat(EvenDigitsOnly.evenDigitsOnly(2468)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(EvenDigitsOnly.evenDigitsOnly(2461)).isFalse();
    }
}
