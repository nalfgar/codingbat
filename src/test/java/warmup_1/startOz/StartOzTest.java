package warmup_1.startOz;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static warmup_1.startOz.StartOz.startOz;

public class StartOzTest {

    @Test
    public void testOne() {
        assertThat(startOz("ozymandias")).isEqualTo("oz");
    }

    @Test
    public void testTwo() {
        assertThat(startOz("bzoo")).isEqualTo("z");
    }

    @Test
    public void testThree() {
        assertThat(startOz("oxx")).isEqualTo("o");
    }
}
