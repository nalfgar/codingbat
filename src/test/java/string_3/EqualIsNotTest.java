package string_3;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static string_3.EqualIsNot.equalIsNot;

public class EqualIsNotTest {

    @Test
    public void testOne(){
        assertThat(equalIsNot("This is not")).isEqualTo(false);
    }

    @Test
    public void testTwo(){
        assertThat(equalIsNot("This is notnot")).isEqualTo(true);
    }


}
