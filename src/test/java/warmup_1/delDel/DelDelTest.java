package warmup_1.delDel;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static warmup_1.delDel.DelDel.delDel;

public class DelDelTest {

    @Test
    public void testOne() {
        assertThat(delDel("adelbc")).isEqualTo("abc");
    }

    @Test
    public void testTwo() {
        assertThat(delDel("adelHello")).isEqualTo("aHello");
    }

    @Test
    public void testTHree() {
        assertThat("ala ma kota").isEqualTo("ala ma kota");
    }
}
