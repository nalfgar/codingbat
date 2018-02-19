package codeFights.throughTheFog;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DepositProfitTest {


    @Test
    public void testOne() {
        assertThat(DepositProfit.depositProfit(100, 20, 170)).isEqualTo(3);
    }
}
