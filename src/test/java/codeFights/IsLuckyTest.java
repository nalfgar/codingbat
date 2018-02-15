package codeFights;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class IsLuckyTest {

    @Test
    public void testOne() {
        assertThat(IsLucky.isLucky(1230)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(IsLucky.isLucky(111111)).isTrue();
    }

    @Test
    public void testThree() {
        assertThat(IsLucky.isLucky(111255)).isFalse();
    }


}
