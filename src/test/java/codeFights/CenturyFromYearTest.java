package codeFights;

import org.junit.Test;

import static codeFights.CenturyFromYear.centuryFromYearTest;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CenturyFromYearTest {

    @Test
    public void testOne() {
        assertThat(centuryFromYearTest(1)).isEqualTo(1);
    }

    @Test
    public void test99() {
        assertThat(centuryFromYearTest(99)).isEqualTo(1);
    }

    @Test
    public void test100() {
        assertThat(centuryFromYearTest(100)).isEqualTo(1);
        assertThat(centuryFromYearTest(101)).isEqualTo(2);
        assertThat(centuryFromYearTest(199)).isEqualTo(2);

    }

    @Test
    public void test200() {
        assertThat(centuryFromYearTest(200)).isEqualTo(2);
        assertThat(centuryFromYearTest(201)).isEqualTo(3);
        assertThat(centuryFromYearTest(299)).isEqualTo(3);
    }

    @Test
    public void test900() {
        assertThat(centuryFromYearTest(900)).isEqualTo(9);
        assertThat(centuryFromYearTest(901)).isEqualTo(10);
        assertThat(centuryFromYearTest(999)).isEqualTo(10);
    }

    @Test
    public void test1000() {
        assertThat(centuryFromYearTest(1000)).isEqualTo(10);
        assertThat(centuryFromYearTest(1001)).isEqualTo(11);
        assertThat(centuryFromYearTest(1999)).isEqualTo(20);
    }

    @Test
    public void test2000() {
        assertThat(centuryFromYearTest(2000)).isEqualTo(20);
        assertThat(centuryFromYearTest(2001)).isEqualTo(21);
        assertThat(centuryFromYearTest(2005)).isEqualTo(21);
    }




}
