package StrategyProject;

import java.util.Locale;
import java.util.Scanner;

public class GameOver {
    public static void gameOver() {
        System.out.println("You have lost");
        String input = "0";
        while (!start(input)) {
            System.out.println("Type start to play once again");
            input = new Scanner(System.in).nextLine();
        }
    }

    public static boolean start(String input) {
        if (input.toUpperCase(Locale.ROOT).equals("START")) {
            new Game().run();
            return true;
        }
        return false;
    }
}
