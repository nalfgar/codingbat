package warmup_1.backAround;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class backAroundTest {

    @Test
    public void oneLetterWord(){
        assertEquals("aaa", BackAround.backAround("a"));
    }

    @Test
    public void moreThanOneLetterWord(){
        assertEquals("tcatt", BackAround.backAround("cat"));
    }

}
