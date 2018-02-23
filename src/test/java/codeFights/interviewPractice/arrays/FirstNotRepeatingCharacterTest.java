package codeFights.interviewPractice.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstNotRepeatingCharacterTest {

    @Test
    public void testOne() {
        Assertions.assertThat(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abacabad")).isEqualTo('c');
    }

    @Test
    public void testTwo() {
        Assertions.assertThat(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abacabaabacaba")).isEqualTo('_');
    }

    @Test
    public void testThree() {
        Assertions.assertThat(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("z")).isEqualTo('z');
    }
}
