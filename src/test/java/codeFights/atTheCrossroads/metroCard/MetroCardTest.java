package codeFights.atTheCrossroads.metroCard;

import org.junit.Test;

import static codeFights.atTheCrossroads.metroCard.MetroCard.metroCard;
import static org.assertj.core.api.Assertions.assertThat;

public class MetroCardTest {

    @Test
    public void testOne() {
        assertThat(metroCard(30)).isEqualTo(new int[]{31});
    }

    @Test
    public void testTwo() {
        assertThat(metroCard(31)).isEqualTo(new int[]{28, 30, 31});
    }
}
