package warmup_1.backAround;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static warmup_1.backAround.BackAround.backAround;

public class backAroundTest {

    @Test
    public void oneLetterWord(){
        assertThat(backAround("a")).isEqualTo("aaa");
    }

    @Test
    public void moreThanOneLetterWord(){
        assertThat(backAround("cat")).isEqualTo("tcatt");
    }

}
