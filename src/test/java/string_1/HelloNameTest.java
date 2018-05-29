package string_1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloNameTest {

    @Test
    public void testOne() {
        assertThat(HelloName.HelloName("Bob")).isEqualTo("Hello Bob!");
    }

    @Test
    public void testTwo() {
        assertThat(HelloName.HelloName("Alice")).isEqualTo("Hello Alice!");
    }

    @Test
    public void testThree() {
        assertThat(HelloName.HelloName("X")).isEqualTo("Hello X!");
    }
}
