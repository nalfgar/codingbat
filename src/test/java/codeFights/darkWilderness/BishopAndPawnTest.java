package codeFights.darkWilderness;

import org.junit.Test;

import static codeFights.darkWilderness.BishopAndPawn.bishopAndPawn;
import static org.assertj.core.api.Assertions.assertThat;

public class BishopAndPawnTest {

    @Test
    public void testOne() {
        String bishop = "a1",
                pawn = "c3";

        assertThat(bishopAndPawn(bishop, pawn)).isTrue();
    }
}
