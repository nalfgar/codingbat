package codeFights.edgeOfTheOcean;

import org.junit.Test;

import static codeFights.edgeOfTheOcean.MakeArrayConsecutive2.makeArrayConsecutive2;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MakeArrayConsecutive2Test {

    @Test
    public void testOne() {
        int[] statues = new int[]{6, 2, 3, 8};

        assertThat(makeArrayConsecutive2(statues)).isEqualTo(3);
    }

    @Test
    public void testTwo() {
        int[] statues = new int[]{0, 3};

        assertThat(makeArrayConsecutive2(statues)).isEqualTo(2);
    }

    @Test
    public void testThree() {
        int[] statues = new int[]{5, 4, 6};

        assertThat(makeArrayConsecutive2(statues)).isEqualTo(0);
    }

    @Test
    public void testFour() {
        int[] statues = new int[]{6, 3};

        assertThat(makeArrayConsecutive2(statues)).isEqualTo(2);
    }
}
