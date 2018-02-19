package codeFights.throughTheFog;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringsRearrangementTest {

    @Test
    public void testOne() {
        String[] inputArray = new String[]{"aba","bbb", "bab"};
        assertThat(StringsRearrangementX.stringsRearrangementX(inputArray)).isFalse();
    }


//    @Test
//    public void testTwo() {
//        String[] inputArray = new String[]{"aaa","aaa", "aaa"};
//        assertThat(stringsRearrangement(inputArray)).isFalse();
//    }
//
//    @Test
//    public void testThree() {
//        String[] inputArray = new String[]{"aba", "bbb", "bab"};
//        assertThat(stringsRearrangement(inputArray)).isFalse();
//    }
}