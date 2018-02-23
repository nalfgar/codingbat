package codeFights.throughTheFog;

import org.junit.Test;

import static codeFights.throughTheFog.StringsRearrangementX.stringsRearrangement;
import static org.assertj.core.api.Assertions.assertThat;

public class StringsRearrangementTest {

    @Test
    public void testOne() {
        String[] inputArray0 = new String[]{"aa","ab","ba","ab"};
        assertThat(stringsRearrangement(inputArray0)).isTrue();
    }


}