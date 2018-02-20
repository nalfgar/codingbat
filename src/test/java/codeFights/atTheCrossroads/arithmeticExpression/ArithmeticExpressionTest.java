package codeFights.atTheCrossroads.arithmeticExpression;

import org.junit.Test;

import static codeFights.atTheCrossroads.arithmeticExpression.ArithmeticExpression.arithmeticExpression;
import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticExpressionTest {

    @Test
    public void testOne() {
        assertThat(arithmeticExpression(2,3,5)).isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(arithmeticExpression(8,2,4)).isTrue();
    }

    @Test
    public void testThree() {
        assertThat(arithmeticExpression(8,3,3)).isFalse();
    }

    @Test
    public void testFour() {
        assertThat(arithmeticExpression(6,3,3)).isTrue();
    }

    @Test
    public void testFive() {
        assertThat(arithmeticExpression(18,2,9 )).isTrue();
    }

    @Test
    public void testSix() {
        assertThat(arithmeticExpression(5,2,0 )).isFalse();
    }


}
