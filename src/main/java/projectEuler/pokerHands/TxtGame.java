package projectEuler.pokerHands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtGame {
    public static void main(String[] args) {
        int playerOneWinCounter = 0;
        Scanner fileScanner = null;
        Game game;
        String line;
        try {
            fileScanner = new Scanner(new File("p054_poker.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (fileScanner.hasNext()) {
            line = fileScanner.nextLine();
            game = new Game(line);
            if (game.whoWins() == 1) {
                playerOneWinCounter++;
            }
        }

        fileScanner.close();
        System.out.println(playerOneWinCounter);
    }

}
