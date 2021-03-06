package warmup_2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoTriplesTest {

    @Test
    public void testOne(){
        int[] ints = {1, 1, 2, 2, 1};
        Assert.assertEquals(true, NoTriples.noTriples(ints));
    }

    @Test
    public void testTwo(){
        int[] ints = {1, 1, 2, 2, 2, 1};
        assertEquals(false, NoTriples.noTriples(ints));
    }

    @Test
    public void testThree(){
        int[] ints = {1, 1, 1, 2, 2, 2, 1};
        assertEquals(false, NoTriples.noTriples(ints));
    }


}
