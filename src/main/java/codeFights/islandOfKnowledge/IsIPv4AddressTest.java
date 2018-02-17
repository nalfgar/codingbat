package codeFights.islandOfKnowledge;

import org.junit.Test;

import static codeFights.islandOfKnowledge.IsIPv4Address.isIPv4Address;
import static org.assertj.core.api.Assertions.assertThat;

public class IsIPv4AddressTest {

    @Test
    public void testOne() {
        assertThat(isIPv4Address("172.16.254.1")).isTrue();

    }
}
