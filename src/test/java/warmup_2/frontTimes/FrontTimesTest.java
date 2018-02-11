package warmup_2.frontTimes;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static warmup_2.frontTimes.FrontTimes.frontTimes;


public class FrontTimesTest {

    @Test
    public void testOne() {
        assertThat(frontTimes("Chocolate", 2)).isEqualTo("ChoCho");
    }

    @Test
    public void testTwo() {
        assertThat(frontTimes("Chocolate", 3)).isEqualTo("ChoChoCho");
    }

    @Test
    public void testThree() {
        assertThat(frontTimes("Abc", 3)).isEqualTo("AbcAbcAbc");
    }

    @Test
    public void testFour() {
        assertThat(frontTimes("A", 5)).isEqualTo("AAAAA");
    }

}
