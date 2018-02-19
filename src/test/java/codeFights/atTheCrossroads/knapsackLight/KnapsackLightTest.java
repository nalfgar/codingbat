package codeFights.atTheCrossroads.knapsackLight;


import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class KnapsackLightTest {

    @Test
    public void testOne() {
        assertThat(KnapsackLight.knapsackLight(10,6,5,5,8)).isEqualTo(10);
    }

//    TODO more test !!!!

}