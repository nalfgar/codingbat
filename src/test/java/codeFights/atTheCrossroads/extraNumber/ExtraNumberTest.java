package codeFights.atTheCrossroads.extraNumber;

import org.junit.Test;

import static codeFights.atTheCrossroads.extraNumber.ExtraNumber.extraNumber;
import static org.assertj.core.api.Assertions.assertThat;

public class ExtraNumberTest {

    @Test
    public void testOne() {
        assertThat(extraNumber(3,2,2)).isEqualTo(3);
    }
}
