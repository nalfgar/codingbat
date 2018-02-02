package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFashionTest {

    @Test
    public void testOne(){
        assertEquals(2, DateFashion.dateFashionTest(5, 10));
    }

    @Test
    public void testTwo(){
        assertEquals(0, DateFashion.dateFashionTest(5, 2));
    }

    @Test
    public void testThree(){
        assertEquals(1, DateFashion.dateFashionTest(5, 5));
    }

//    TODO - method does not pass the all tests int site
}
