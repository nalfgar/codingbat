package codeFights.throughTheFog;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringsRearrangementTest {

    @Test
    public void testOne() {
        String[] inputArray0 = new String[]{"aa","ab","ba","ab"};
        assertThat(StringsRearrangementX.stringsRearrangement(inputArray0)).isTrue();
    }

//    @Test
//    public void tesTwo() {
//        String[] inputArray0 = new String[]{"ab",
//                "bb",
//                "aa"};
//        assertThat(StringsRearrangement.stringsRearrangement(inputArray0)).isTrue();
//    }

}