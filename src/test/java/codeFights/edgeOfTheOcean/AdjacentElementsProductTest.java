package codeFights.edgeOfTheOcean;

import org.junit.Test;

import static codeFights.edgeOfTheOcean.AdjacentElementsProduct.adjacentElementsProduct;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class AdjacentElementsProductTest {

    @Test
    public void testOne() {
        int[] inputArray = new int[]{3, 6, -2, -5, 7, 3};

        assertThat(adjacentElementsProduct(inputArray)).isEqualTo(21);
    }

    @Test
    public void testTwo() {
        int[] inputArray = new int[]{-1, -2};

        assertThat(adjacentElementsProduct(inputArray)).isEqualTo(2);
    }

    @Test
    public void testThree() {
        int[] inputArray = new int[]{5, 1, 2, 3, 1, 4};

        assertThat(adjacentElementsProduct(inputArray)).isEqualTo(6);
    }

    @Test
    public void testFour() {
        int[] inputArray = new int[]{1, 0, 1, 0, 1000};

        assertThat(adjacentElementsProduct(inputArray)).isEqualTo(0);
    }
}
