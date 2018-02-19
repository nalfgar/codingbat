package codeFights.theCore.phoneCall;

import org.junit.Test;

import static codeFights.theCore.phoneCall.PhoneCall.phoneCall;
import static org.assertj.core.api.Assertions.assertThat;

public class PhoneCallTest {

    @Test
    public void testOne() {
        int a = 3;
        int b = 1;
        int c = 1;
        int s = 2;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(0);
    }

    @Test
    public void testTwo() {
        int a = 3;
        int b = 1;
        int c = 2;
        int s = 20;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(14);
    }

    @Test
    public void testThree() {
        int a = 2;
        int b = 3;
        int c = 1;
        int s = 2;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(1);
    }

    @Test
    public void testFour() {
        int a = 10;
        int b = 1;
        int c = 2;
        int s = 22;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(11);
    }

    @Test
    public void testFive() {
        int a = 2;
        int b = 2;
        int c = 1;
        int s = 24;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(14);
    }

    @Test
    public void testSix() {
        int a = 1;
        int b = 2;
        int c = 1;
        int s = 6;
        assertThat(phoneCall(a, b, c, s)).isEqualTo(3);
    }
}
