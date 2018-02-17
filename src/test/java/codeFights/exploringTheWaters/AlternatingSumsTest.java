package codeFights.exploringTheWaters;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AlternatingSumsTest {

    @Test
    public void testOne() {
        int[] givenWeight = new int[]{50, 60, 60, 45, 70};
        int[] sumWeightTeam = new int[]{180, 105};

        Assertions.assertThat(AlternatingSums.alternatingSums(givenWeight)).isEqualTo(sumWeightTeam);
    }
}
