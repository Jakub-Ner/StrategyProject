package StrategyProject;

import java.util.Scanner;

public class GameOver {
    public static void gameOver() {
        System.out.println("You have lost");
        String input = "0";
        while (!new BackToStart().back(input)) {
            input = new Scanner(System.in).nextLine();
        }
    }
}
