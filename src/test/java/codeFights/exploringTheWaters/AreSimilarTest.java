package codeFights.exploringTheWaters;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class AreSimilarTest {

    @Test
    public void testOne() {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{1,2,3};

        AssertionsForClassTypes.assertThat(AreSimilar.areSimilar(a, b)).isTrue();
    }

    @Test
    public void testTwo() {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{2,1,3};

        assertThat(AreSimilar.areSimilar(a, b)).isTrue();
    }

    @Test
    public void testThree() {
        int[] a = new int[]{1,2,2};
        int[] b = new int[]{2,1,1};

        assertThat(AreSimilar.areSimilar(a, b)).isFalse();
    }


}
