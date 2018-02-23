package codeFights.boots;

import org.junit.Test;

import static codeFights.boots.TaskMaker.taskMaker;
import static org.assertj.core.api.Assertions.assertThat;

public class TaskMakerTest {

    @Test
    public void testOne() {
        String[] givenSource = new String[]{"ans = 0",
                "for i in range(n):",
                "    for j in range(n):",
                "    //DB 3//for j in range(1, n):",
                "    //DB 2//for j in range(n + 1):",
                "        ans += 1",
                "return ans"};

        String[] expectedSource = new String[]{"ans = 0",
                "for i in range(n):",
                "    for j in range(1, n):",
                "        ans += 1",
                "return ans"};


        assertThat(taskMaker(givenSource, 3)).isEqualTo(expectedSource);
    }
}
