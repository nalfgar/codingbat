package codeFights.atTheCrossroads.tennisSet;

import org.junit.Test;

import static codeFights.atTheCrossroads.tennisSet.TennisSet.tennisSet;
import static org.assertj.core.api.Assertions.assertThat;

public class TennisSetTest {

    @Test
    public void testOne() {
        assertThat(tennisSet(3,6)).isTrue();
    }
}
