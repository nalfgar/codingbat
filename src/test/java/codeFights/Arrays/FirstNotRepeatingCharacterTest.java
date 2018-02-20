package codeFights.Arrays;

import org.junit.Test;

import static codeFights.Arrays.FirstNotRepeatingCharacter.firstNotRepeatingCharacter;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstNotRepeatingCharacterTest {

    @Test
    public void testOne() {
        assertThat(firstNotRepeatingCharacter("abacabad")).isEqualTo('c');
    }

    @Test
    public void testTwo() {
        assertThat(firstNotRepeatingCharacter("abacabaabacaba")).isEqualTo('_');
    }

    @Test
    public void testThree() {
        assertThat(firstNotRepeatingCharacter("z")).isEqualTo('z');
    }
}
