package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.IsIPv4Address.isIPv4Address;
import static org.assertj.core.api.Assertions.assertThat;

public class IsIPv4AddressTest {

    @Test
    public void testOne() {
        assertThat(isIPv4Address("172.16.254.1")).isTrue();

    }

    @Test
    public void testTwo() {
        assertThat(isIPv4Address("172.316.254.1")).isFalse();

    }

    @Test
    public void testThree() {
        assertThat(isIPv4Address(".316.254.1")).isFalse();

    }

    @Test
    public void testFour() {
        assertThat(isIPv4Address(".254.255.0")).isFalse();
    }
}
