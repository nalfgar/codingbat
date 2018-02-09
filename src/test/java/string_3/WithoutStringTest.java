package string_3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static string_3.WithoutString.withoutString;

public class WithoutStringTest {

    @Test
    public void testOne(){
        assertThat(withoutString("Hello there", "llo")).isEqualTo("He there");
    }

    @Test
    public void testTwo(){
        assertThat(withoutString("Hello there", "e")).isEqualTo("Hllo thr");
    }

    @Test
    public void testThree(){
        assertThat(withoutString("Hello there", "x")).isEqualTo("Hello there");
    }

    @Test
    public void testFour(){
        assertThat(withoutString("xxx", "xx")).isEqualTo("x");
    }
    @Test
    public void testFfive(){
        assertThat(withoutString("xyzzy", "Y")).isEqualTo("xzz");
    }
}
