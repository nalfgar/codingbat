package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static projectEuler.SpecialPythagoreanTriplet.specialPythagoreanTriplet;

public class SpecialPythagoreanTripletTest {

    @Test
    public void testOne(){
        int[] expectedTriplet = {200, 375, 425};

        assertArrayEquals(expectedTriplet, specialPythagoreanTriplet(1000));
    }
}
