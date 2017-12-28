package AP_1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ScoreUpTest {

    @Test
    public void testOne(){
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "c", "b", "c"};

        assertEquals(6, ScoreUp.scoreUp(key, answers));
    }

    @Test
    public void testTwo(){
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "a", "b", "c"};

        assertEquals(11, ScoreUp.scoreUp(key, answers));
    }
}
