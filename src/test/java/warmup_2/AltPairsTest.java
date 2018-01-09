package warmup_2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AltPairsTest {
    @Test
    public void testOne(){
        Assert.assertEquals("kien", AltPairs.altPairs("kitten"));
    }

    @Test
    public void testTwo(){
        assertEquals("Chole", AltPairs.altPairs("Chocolate"));
    }

    @Test
    public void testThree(){
        assertEquals("Congrr", AltPairs.altPairs("CodingHorror"));
    }


}
