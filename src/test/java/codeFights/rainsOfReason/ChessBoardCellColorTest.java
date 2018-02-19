package codeFights.rainsOfReason;

import org.junit.Test;

import static codeFights.rainsOfReason.ChessBoardCellColor.chessBoardCellColor;
import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardCellColorTest {

    @Test
    public void testOne() {
        String cell1 = "A1";
        String cell2 = "B2";

        assertThat(chessBoardCellColor(cell1, cell2)).isTrue();
    }

    @Test
    public void testTwo() {
        String cell1 = "A1";
        String cell2 = "A3";

        assertThat(chessBoardCellColor(cell1, cell2)).isTrue();
    }

    @Test
    public void testThree() {
        String cell1 = "A1";
        String cell2 = "H3";

        assertThat(chessBoardCellColor(cell1, cell2)).isFalse();
    }
}
