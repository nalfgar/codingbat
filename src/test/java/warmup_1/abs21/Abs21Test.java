package warmup_1.abs21;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static warmup_1.abs21.Abs21.abs21;

public class Abs21Test {

    @Test
    public void test19(){
        assertThat(abs21(19)).isEqualTo(2);
    }

    @Test
    public void test10(){
        assertThat(abs21(11)).isEqualTo(10);
    }

    @Test
    public void test21(){
        assertThat(abs21(21)).isEqualTo(0);
    }

    @Test
    public void test22(){
        assertThat(abs21(22)).isEqualTo(1*2);
    }

    @Test
    public void test25(){
        assertThat(abs21(25)).isEqualTo(4*2);
    }
}
