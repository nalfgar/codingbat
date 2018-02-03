package aKodu;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AnimalsTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void dogVoice() {
        Dog dog = new Dog();
        dog.giveVoice();
        assertEquals("Hauuu!\r\n", outContent.toString());
    }

    @Test
    public void catVoice() {
        Cat cat = new Cat();
        cat.giveVoice();
        assertEquals("Miauuu!\r\n", outContent.toString());
    }

    @Test
    public void mouseVoice() {
        Mouse mouse = new Mouse();
        mouse.giveVoice();
        assertEquals("Pi\r\n", outContent.toString());
    }

}