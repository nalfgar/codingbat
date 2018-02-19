package codeFights.atTheCrossroads.reachNextLevel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReachNextLevelTest {

    @Test
    public void testOne() {
        Assertions.assertThat(ReachNextLevel.reachNextLevel(10, 15, 5)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(ReachNextLevel.reachNextLevel(10, 15, 4)).isFalse();
    }
}
