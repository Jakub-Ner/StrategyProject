package StrategyProject;

import java.util.Arrays;
import java.util.Scanner;

public class Game extends BackToStart {
    final int[] options = new int[]{1, 2};

    public Game() {
    }

    public void run() {
        super.option = 0;
        Player player;
        Board board;

        while (option == 0) {
            super.option = welcomeScreen();
        }
        if (super.option == 1) {
            player = new Player();
            board = new Board(player.getLastCharacter());
            board.initBoard();
            while (super.option != 1234) {
                super.option = new Scanner(System.in).nextInt();
                board.updateBoard(super.option);
            }
        }
        super.back();

    }

    public int welcomeScreen() {
        System.out.println("elo\n [1] Play");
        super.option = new Scanner(System.in).nextInt();

        for (int availableOpion : options) {
            if (super.option == availableOpion) {
                return super.option;
            }
        }
        System.out.println("Input one value of " + Arrays.toString(options));
        return 0;
    }


}
