package lista;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithArgumentLessThanZero(){
        Lista lista = new Lista(-5);
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
    @Test
    public void testPisz(){
        Lista lista = new Lista(5);
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.dodajElement(500);
        lista.pisz();
    }

//    TODO implement usunPierwszy, usunPowtorzenia and zapiszDoPliku methods
//
}
