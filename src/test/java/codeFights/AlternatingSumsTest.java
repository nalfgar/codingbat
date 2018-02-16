package codeFights;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlternatingSumsTest {

    @Test
    public void testOne() {
        int[] givenWeight = new int[]{50, 60, 60, 45, 70};
        int[] sumWeightTeam = new int[]{180, 105};

        assertThat(AlternatingSums.alternatingSums(givenWeight)).isEqualTo(sumWeightTeam);
    }
}
