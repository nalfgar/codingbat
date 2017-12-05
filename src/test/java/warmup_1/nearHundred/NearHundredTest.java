package warmup_1.nearHundred;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearHundredTest {

    @Test
    public void testNinetyThree(){
        assertEquals(true, NearHundred.nearHundred(93));
    }

    @Test
    public void testNinety(){
        assertEquals(true, NearHundred.nearHundred(90));
    }

    @Test
    public void testEigtyNine(){
        assertEquals(false, NearHundred.nearHundred(89));
    }

    @Test
    public void testOneHoundredFive(){
        assertEquals(true, NearHundred.nearHundred(105));
    }

    @Test
    public void testOneNinetyOne(){
        assertEquals(true, NearHundred.nearHundred(191));
    }



}
