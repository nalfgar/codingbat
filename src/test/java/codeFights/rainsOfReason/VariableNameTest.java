package codeFights.rainsOfReason;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VariableNameTest {

    @Test
    public void testOne() {

        assertThat(VariableName.variableName("var_1__Int")).isTrue();
    }

    @Test
    public void testTwo() {

        assertThat(VariableName.variableName("5var_1__Int")).isFalse();
    }

    @Test
    public void testThree() {

        assertThat(VariableName.variableName("qq-q")).isFalse();
    }

    @Test
    public void testFour() {

        assertThat(VariableName.variableName(" variable")).isFalse();
    }
}
