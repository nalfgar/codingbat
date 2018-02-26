package codeFights.darkWilderness;

import java.util.ArrayList;
import java.util.List;

public class BishopAndPawn {
    public static boolean bishopAndPawn(String bishop, String pawn) {
        List<String> white = new ArrayList<>();
        white.add("a1");
        white.add("a3");
        white.add("a5");
        white.add("a7");
        white.add("b2");
        white.add("b4");
        white.add("b6");
        white.add("b8");
        white.add("c1");
        white.add("c3");
        white.add("c5");
        white.add("c7");
        white.add("d2");
        white.add("d4");
        white.add("d6");
        white.add("d8");
        white.add("e1");
        white.add("e3");
        white.add("e5");
        white.add("e7");
        white.add("f2");
        white.add("f4");
        white.add("f6");
        white.add("f8");
        white.add("g1");
        white.add("g3");
        white.add("g5");
        white.add("g7");
        white.add("h2");
        white.add("h4");
        white.add("h6");
        white.add("h8");

        List<String> black = new ArrayList<>();
        black.add("a2");
        black.add("a4");
        black.add("a6");
        black.add("a8");
        black.add("b1");
        black.add("b3");
        black.add("b5");
        black.add("b7");
        black.add("c2");
        black.add("c4");
        black.add("c6");
        black.add("c8");
        black.add("d1");
        black.add("d3");
        black.add("d5");
        black.add("d7");
        black.add("e2");
        black.add("e4");
        black.add("e6");
        black.add("e8");
        black.add("f1");
        black.add("f3");
        black.add("f5");
        black.add("f7");
        black.add("g2");
        black.add("g4");
        black.add("g6");
        black.add("g8");
        black.add("h1");
        black.add("h3");
        black.add("h5");
        black.add("h7");

        if ((white.contains(bishop) && white.contains(pawn)) || (black.contains(bishop) && black.contains(pawn))){
            return true;
        }

        return false;
    }
}
