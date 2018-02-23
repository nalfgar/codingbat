package codeFights.boots;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompanyBotStrategyTest {


    @Test
    public void testOne() {
        assertThat(CompanyBotStrategy.companyBotStrategy(new int[][]{{3,1},{6,1},{4,1},{5,1}})).isEqualTo(4.5);
    }


    @Test
    public void testTwo() {
        assertThat(CompanyBotStrategy.companyBotStrategy(new int[][]{{4,1},{4,-1},{0,0},{6,1}})).isEqualTo(5.0);
    }
}
