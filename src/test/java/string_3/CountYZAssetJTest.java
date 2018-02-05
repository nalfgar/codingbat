package string_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static string_3.CountYZ.countYZ;

public class CountYZAssetJTest {

    @Test
    public void testOne(){
        assertThat(countYZ("fez day")).isEqualTo(2);
    }

    @Test
    public void testTwo(){
        assertThat(countYZ("day fez")).isEqualTo(2);
    }

    @Test
    public void testThree(){
        assertThat(countYZ("day fyyyz")).isEqualTo(2);
    }
}
