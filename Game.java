package StrategyProject;

import StrategyProject.Board.Board;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    final int[] options = new int[]{1, 2};
    protected int option;
    public static Player player;
    public static int round;
    Board board;

    public Game() {
    }

    public void run() {
        option = 0;

        while (option == 0) {
            option = welcomeScreen();
        }
        if (option == 1) {
            player = new Player();
            play();
        }
    }

    public void play() {
        player.generateCharacter();
        player.getCurrentCharacter().getBoost();
        player.chooseItems();
        round = 1;
        board = new Board();
        board.initBoard(player);

        while (option != 100) {
            takeInput();
//            if (player.getCurrentCharacter().getHp() <= 0) {
//                System.out.println("you have die!");
//            }
            board.updateBoard(option);
            round++;
        }
    }
    public boolean backToMenu(String input) {
        if (input.toUpperCase(Locale.ROOT).equals("MENU")) {
            Fight.messages.clear();
            play();
            return true;
        }
        return false;
    }

    public int welcomeScreen() {
        System.out.println("elo\n [1] Play");
        takeInput();
        for (int availableOpion : options) {
            if (option == availableOpion) {
                return option;
            }
        }
        System.out.println("Input one value of " + Arrays.toString(options));
        return 0;
    }

    private void takeInput() {
        option = 0;
        String input = new Scanner(System.in).nextLine();
        if (!backToMenu(input)) {
            int counter = 0;
            while (counter < input.length() && input.charAt(counter) > '9') {
                counter++;
            }
            if (counter < input.length()) {
                option = (int) (input.charAt(counter) - '0');
            }
        }
    }


}
