package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.AreEquallyStrong.areEquallyStrong;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class AreEquallyStrongTest {

    @Test
    public void testOne() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        assertThat(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isTrue();
    }

    @Test
    public void testTwo() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 10;

        assertThat(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isTrue();
    }

    @Test
    public void testThree() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;

        assertThat(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isFalse();
    }

    @Test
    public void testfour() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 5;
        int friendsRight = 20;

        assertThat(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isFalse();
    }


}
