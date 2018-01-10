package lista;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListaTest {

    @Before
    public void setup(){
        Lista lista = new Lista(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithArgumentLessThanZero(){
        Lista lista0 = new Lista(-5);
    }

    @Test
    public void testConstructorWithArgumentMoreThanZero(){
        Lista lista = new Lista(5);

        assertEquals(5, lista.getPojemnosc());
        assertEquals(0, lista.getRozmiar());
    }

    @Test
    public void testDodajElementMethod(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        assertEquals(1, lista.getRozmiar());
        lista.dodajElement(1);
        assertEquals(2, lista.getRozmiar());
        lista.dodajElement(1);
        assertEquals(3, lista.getRozmiar());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testDodajElementMoreThanRozmiarMethod(){
        Lista lista = new Lista(2);

        lista.dodajElement(1);
        lista.dodajElement(1);
        lista.dodajElement(1);
    }

    @Test
    public void testZnajdzMethod(){
        Lista lista = new Lista(5);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.dodajElement(500);

        assertEquals(0, lista.znajdz(1));
        assertEquals(1, lista.znajdz(2));
        assertEquals(4, lista.znajdz(500));

        assertEquals(-1, lista.znajdz(77777));
    }

//    TODO how to test void method with sout?
//    @Test
//    public void testPisz(){
//        Lista lista = new Lista(5);
//        lista.dodajElement(1);
//        lista.dodajElement(2);
//        lista.dodajElement(3);
//        lista.dodajElement(4);
//        lista.dodajElement(500);
//        lista.pisz();
//    }

    @Test
    public void testUsunPierwszy(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.usunPierwszy(1);

        assertArrayEquals(new int[]{2,3,4,0,0}, lista.getList());

        lista.usunPierwszy(3);

        assertArrayEquals(new int[]{2,4,0,0,0}, lista.getList());;
    }

    @Test
    public void testUsunPowtorzenia(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.usunPowtorzenia();

        assertArrayEquals(new int[]{1,2,0,0,0}, lista.getList());
    }

    @Test
    public void testUsunPowtorzenia1(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(10);
        lista.dodajElement(10);
        lista.usunPowtorzenia();

        assertArrayEquals(new int[]{1,10,0,0,0}, lista.getList());
    }

    @Test
    public void testUsunPowtorzenia2(){
        Lista lista = new Lista(20);

        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);
        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);
        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);
        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);
        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);
        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(100);

        lista.usunPowtorzenia();

        assertArrayEquals(new int[]{1,10,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, lista.getList());
    }

    @Test
    public void testIlerazyWystepuje(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(10);
        lista.dodajElement(10);

        assertEquals(1, lista.ileRazyWystepuje(1));
        assertEquals(3, lista.ileRazyWystepuje(10));
    }

    @Test
    public void testUsunOstatni(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(10);
        lista.dodajElement(10);

        lista.usunOstatni(10);

        assertArrayEquals(new int[]{1,10,10,0,0}, lista.getList());

        lista.usunOstatni(10);
        assertArrayEquals(new int[]{1,10,0,0,0}, lista.getList());
    }

    @Test
    public void testZapiszDoPliku(){
        Lista lista = new Lista(5);

        lista.dodajElement(1);
        lista.dodajElement(10);
        lista.dodajElement(10);
        lista.dodajElement(10);

        lista.zapiszDoPliku("xxxxxxx.txt");

    }

}