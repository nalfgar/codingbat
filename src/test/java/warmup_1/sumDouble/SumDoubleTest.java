package warmup_1.sumDouble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDoubleTest {
    @Test
    public void valuesAreNotTheSame(){
        assertEquals(3, SumDouble.sumDouble(1, 2));
    }

    public void valuesAreTheSame(){
        assertEquals(8, SumDouble.sumDouble(2, 2));
    }
}
