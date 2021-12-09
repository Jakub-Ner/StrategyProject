package StrategyProject.Board;

import StrategyProject.NPC;
import StrategyProject.Player;
import StrategyProject.characters.Character;
import StrategyProject.characters.DisplayCharacter;

import java.util.Arrays;
import java.util.Random;

public class Board {
    final int HEIGHT = 25;
    final int WIDTH = 61;

    SideBar sideBar;
    public static char[][] board;
    public static NPC npc;
    Character character;
    DisplayCharacter displayCharacter;

    public Board() {

    }


    private void obstacles() {
        Random random = new Random();
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH * 3 / 4; j++) {
                if (random.nextInt(100) > 80) {
                    board[i][j] = 'X';
                } else board[i][j] = '#';
            }
        }
    }

    private void partOfBoard(int limit, int[][] start) {
        Random random = new Random();
        boolean newField = true;
        do {
//            if (newField) {
            limit--;
            for (int i = 0; i < start.length; i++) {
                board[start[i][0]][start[i][1]] = ' ';
            }
//            }
            int direction = 2 * (int) Math.pow(-1, random.nextInt(2));
            int coordinate = random.nextInt(2);
            int licznik = 0;

            for (int i = 0; i < start.length; i++) {
                if (start[i][coordinate] + direction <= 0
                        || (coordinate == 0 && start[i][coordinate] + direction >= board.length)
                        || (coordinate == 1 && start[i][coordinate] + direction >= board[0].length)) {
                    continue;
                }
                licznik++;
            }
//            newField = false;
            if (licznik == start.length) {
//                if (board[start[0][0] + ((coordinate + 1) % 2) * direction][start[0][1] + ((coordinate + 0) % 2) * direction] != ' ') {
                for (int i = 0; i < start.length; i++) {
                    start[i][coordinate] += direction;
                }
//                    newField = true;
//                }
            }
        } while (limit > 0);
    }

    private void drawBoard() {
        obstacles();

        int[][] fields = new int[][]{
                {0, 0}, {0, 1},
                {1, 0}, {1, 1}};
        partOfBoard(520, fields);

        int[][] fields2 = new int[][]{
                {board.length - 2, board[0].length - 2}, {board.length - 2, board[0].length - 1},
                {board.length - 1, board[0].length - 2}, {board.length - 1, board[0].length - 1}};
        partOfBoard(332, fields2);

    }


    public void initBoard(Player player) {

        board = new char[HEIGHT][WIDTH * 3 / 4];
        sideBar = new SideBar(HEIGHT, WIDTH / 4);
        this.character = player.getCurrentCharacter();
        displayCharacter = new DisplayCharacter();
        npc = new NPC(board);

        drawBoard();
        sideBar.drawSideBar(player);
//        drawNPC();
        updateBoard(0);
    }

    private void drawNPC() {

        for (int i = 0; i < npc.getListOfNPC().size(); i++) {
            int[][] npcLocation = npc.getListOfNPC().get(i).getLocation();
            for (int j = 0; j < npcLocation.length; j++) {
                board[npcLocation[j][0]][npcLocation[j][1]] = (char) ('0' + i % 10);
            }
        }
    }

    public void drawScreen() {
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(Arrays.toString(board[i]));
            if (i <= HEIGHT / 2 + 1) {
                System.out.print(Arrays.toString(sideBar.getLine(i)));
            } else {
                int x = 10;
            }
            System.out.println(" ");
        }

    }

    public void space() {
        for (int i = 0; i < 10; i++) System.out.println("");
    }

    public void updateBoard(int goFurther) {
        int[][] eraseCharacterFromBoard = character.getLocation();
        for (int i = 0; i < eraseCharacterFromBoard.length; i++) {
            board[eraseCharacterFromBoard[i][0]][eraseCharacterFromBoard[i][1]] = ' ';
        }

        int[][] newLocation = character.moveCharacter(goFurther, board);
        char[] shape = displayCharacter.characterShape(goFurther);
        if (shape.length > 1) {
            for (int i = 0; i < newLocation.length; i++) {
                board[newLocation[i][0]][newLocation[i][1]] = shape[i];
            }
            space();
            drawNPC();
            drawScreen();
        }
    }

}
