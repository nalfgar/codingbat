package warmup_1.max1020;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class max1020Test {

    @Test
//    @Ignore
    public void valueBetween10and20_1(){
        assertEquals(19, Max1020.max1020(11, 19));
    }

    @Test
//    @Ignore
    public void valueBetween10and20_2(){
        assertEquals(19, Max1020.max1020(19, 11));
    }

    @Test
//    @Ignore
    public void valueBetween10and20_3(){
        assertEquals(11, Max1020.max1020(11, 9));
    }

    @Test
//    @Ignore
    public void valueBeyond10and20(){
        assertEquals(0, Max1020.max1020(1, 9));
    }

    @Test
    public void valueBetween10and20_4(){
        assertEquals(10, Max1020.max1020(10, 21));
    }


}
