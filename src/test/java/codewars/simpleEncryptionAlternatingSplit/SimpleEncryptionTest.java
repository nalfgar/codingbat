package codewars.simpleEncryptionAlternatingSplit;


import org.junit.Test;

import static codewars.simpleEncryptionAlternatingSplit.SimpleEncryption.*;
import static org.junit.Assert.assertEquals;

public class SimpleEncryptionTest {

    @Test
    public void whenMethodEncryptRecieveNull(){
        assertEquals(null, encrypt(null, -1));
    }

    @Test
    public void whenMethodEncryptRecieve0(){
        assertEquals("This is a test!", encrypt("This is a test!", 0));
    }

    @Test
    public void whenMethodEncryptRecieve1(){
        assertEquals("hsi  etTi sats!", encrypt("This is a test!", 1));
    }

    @Test
    public void whenMethodEncryptRecieve2(){
        assertEquals("s eT ashi tist!", encrypt("This is a test!", 2));
    }

    @Test
    public void whenMethodEncryptRecieve3(){
        assertEquals(" Tah itse sits!", encrypt("This is a test!", 3));
    }

    @Test
    public void whenMethodEncryptRecieve4(){
        assertEquals("This is a test!", encrypt("This is a test!", 4));
    }

    @Test
    public void whenMethodEncryptRecieveLessTanZero(){
        assertEquals("This is a test!", encrypt("This is a test!", -1));
    }


    @Test
    public void whenMethodDecryptRecieveNull(){
        assertEquals(null, decrypt(null, -1));
    }

    @Test
    public void whenMethodDecryptRecieveZero(){
        assertEquals("This is a test!", decrypt("This is a test!", 0));
    }

    @Test
    public void whenMethodDecryptRecieveLessTanZero(){
        assertEquals("This is a test!", decrypt("This is a test!", -1));
    }


    @Test
    public void whenMethodDecryptRecieve1(){
        assertEquals("This is a test!", decrypt("hsi  etTi sats!", 1));
    }

    @Test
    public void whenMethodDecryptRecieve2(){
        assertEquals("This is a test!", decrypt("s eT ashi tist!", 2));
    }

    @Test
    public void whenMethodDecryptRecieve3(){
        assertEquals("This is a test!", decrypt(" Tah itse sits!", 3));
    }

    @Test
    public void whenMethodDecryptRecieve4(){
        assertEquals("This is a test!", decrypt("This is a test!", 4));
    }
}
