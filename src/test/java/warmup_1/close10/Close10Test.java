package warmup_1.close10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Close10Test {

    @Test
    public void testOne(){
        assertThat(Close10.Close10(8, 13)).isEqualTo(8);
    }

    @Test
    public void testTwo() {
        assertThat(Close10.Close10(13, 8)).isEqualTo(8);
    }


    @Test
    public void testThree() {
        assertThat(Close10.Close10(11, 11)).isEqualTo(0);
    }


}
