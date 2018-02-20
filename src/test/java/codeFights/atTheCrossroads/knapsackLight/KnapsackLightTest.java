package codeFights.atTheCrossroads.knapsackLight;


import org.junit.Test;


import static codeFights.atTheCrossroads.knapsackLight.KnapsackLight.knapsackLight;
import static org.assertj.core.api.Assertions.assertThat;

public class KnapsackLightTest {

    @Test
    public void testOne() {
        assertThat(knapsackLight(10,5,6,4,8)).isEqualTo(10);
    }

    @Test
    public void testTwo() {
        assertThat(knapsackLight(10,5,6,4,9)).isEqualTo(16);
    }

    @Test
    public void testThree() {
        assertThat(knapsackLight(5,3,7,4,6)).isEqualTo(7);
    }

    @Test
    public void testFour() {
        assertThat(knapsackLight(10,2,11,3,1)).isEqualTo(0);
    }

    @Test
    public void testFive() {
        assertThat(knapsackLight(15,2,20,3,2)).isEqualTo(15);
    }


    @Test
    public void test15() {
        assertThat(knapsackLight(4,5,6,5,4)).isEqualTo(0);
    }

    @Test
    public void test8() {
        assertThat(knapsackLight(3,5,3,8,10)).isEqualTo(3);
    }

    @Test
    public void test14() {
        assertThat(knapsackLight(12,4,11,5,6)).isEqualTo(12);
    }
}