package warmup_1.lastDigit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastDigitTest {

    @Test
    public void sevensAreOnTheEnd(){
        assertEquals(true, LastDigit.lastDigit(7, 17));
    }
    @Test
    public void threeAreOnTheEnd(){
        assertEquals(true, LastDigit.lastDigit(3, 122513));
    }
    @Test
    public void zeros(){
        assertEquals(true, LastDigit.lastDigit(0, 0));
    }



    @Test
    public void lastSignsAreDifferent(){
        assertEquals(false, LastDigit.lastDigit(115, 122513));
    }

}
