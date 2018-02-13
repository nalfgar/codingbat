package codeFights;

import org.junit.Test;

import static codeFights.IncrementalBackups.incrementalBackups;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class IncrementalBackupsTest {

    @Test
    public void testOne() {
        int lastBackupTime = 461620205;
        int[][] changes = {{461620203, 1},
                {461620204, 2},
                {461620205, 6},
                {461620206, 5},
                {461620207, 3},
                {461620207, 5},
                {461620208, 1}};
        int[] expectedFiles = {1,3,5};

        assertThat(incrementalBackups(lastBackupTime, changes)).isEqualTo(expectedFiles);
    }
}
