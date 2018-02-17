package codeFights.smoothSailing;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class IsLuckyTest {

    @Test
    public void testOne() {
        Java6Assertions.assertThat(IsLucky.isLucky(1230)).isTrue();
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
