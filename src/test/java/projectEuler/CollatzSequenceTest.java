package projectEuler;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static projectEuler.CollatzSequence.longestCollatzSequence;

public class CollatzSequenceTest {

    @Test
    public void testOne(){
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(13);
        expectedList.add(40);
        expectedList.add(20);
        expectedList.add(10);
        expectedList.add(5);
        expectedList.add(16);
        expectedList.add(8);
        expectedList.add(4);
        expectedList.add(2);
        expectedList.add(1);
//        assertEquals(9, howLongIscollatzSequence(13));
        System.out.println(longestCollatzSequence(10000));
    }
}
