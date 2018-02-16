package codeFights;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBorderTest {

    @Test
    public void testOne() {
        String[] givenPicture = new String[]{"abc", "ded"};
        String[] expectedPicture = new String[]{"*****","*abc*", "*ded*","*****"};

        assertThat(AddBorder.addBorder(givenPicture)).isEqualTo(expectedPicture);
    }

    @Test
    public void testTwo() {
        String[] givenPicture = new String[]{"a"};
        String[] expectedPicture = new String[]{"***","*a*", "***"};

        assertThat(AddBorder.addBorder(givenPicture)).isEqualTo(expectedPicture);
    }
}
