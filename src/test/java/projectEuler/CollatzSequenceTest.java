package projectEuler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static projectEuler.CollatzSequence.howLongIscollatzSequence;

public class CollatzSequenceTest {

    @Test
    public void testOne(){
//        List<Integer> expectedList = new ArrayList<>();
//        expectedList.add(13);
//        expectedList.add(40);
//        expectedList.add(20);
//        expectedList.add(10);
//        expectedList.add(5);
//        expectedList.add(16);
//        expectedList.add(8);
//        expectedList.add(4);
//        expectedList.add(2);
//        expectedList.add(1);
        assertEquals(9, howLongIscollatzSequence(13));
//        System.out.println(longestCollatzSequence(1000000));
    }
}
