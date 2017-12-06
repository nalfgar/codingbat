package warmup_1.makes10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Makes10Test {

    @Test
    public void ifOneOfParametersIs10(){
        assertEquals(true, Makes10.makes10(9, 10));
    }

    @Test
    public void ifBothParametersAreNot10(){
        assertEquals(false, Makes10.makes10(1, 2));
    }

    @Test
    public void ifSumOfParametersIs10(){
        assertEquals(true, Makes10.makes10(5, 5));
    }


}
