package AP_1;

import org.junit.Test;

import static AP_1.HasOne.hasOne;
import static org.junit.Assert.assertEquals;

public class HasOneTest {

    @Test(expected = IllegalArgumentException.class)
    public void ifMethodsGetNegativeArgument() throws IllegalArgumentException{
        hasOne(-1);
    }

    @Test
    public void ifMethodsGet10(){
        assertEquals(true, hasOne(10));
    }

    @Test
    public void ifMethodsGet22(){
        assertEquals(false, hasOne(22));
    }

    @Test
    public void ifMethodsGet56588455(){
        assertEquals(false, hasOne(56588455));
    }
}
