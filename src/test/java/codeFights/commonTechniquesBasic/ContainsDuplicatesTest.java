package codeFights.commonTechniquesBasic;

import org.junit.Test;

import static codeFights.commonTechniquesBasic.ContainsDuplicates.containsDuplicates;
import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicatesTest {

    @Test
    public void testOne() {
        assertThat(containsDuplicates(new int[]{1, 2, 3, 1})).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(containsDuplicates(new int[]{2, 3, 1})).isFalse();
    }

    @Test
    public void testThree() {
        assertThat(containsDuplicates(new int[]{})).isFalse();
    }
}
