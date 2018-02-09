package string_3;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static string_3.CountYZ.countYZ;

public class CountYZTest {

    @Test
    public void testOne(){
        assertThat(countYZ("fez day")).isEqualTo(2);
    }

    @Test
    public void testTwo(){
        assertThat(countYZ("day fez")).isEqualTo(2);
    }

    @Test
    public void testThre(){
        assertThat(countYZ("day fyyyz")).isEqualTo(2);
    }
}
