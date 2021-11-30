package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.DisplayCharacter;

import java.util.Arrays;
import java.util.Random;

public class Board {
    final int HEIGHT = 25;
    final int WIDTH = 50;

    private char[][] sideBar;
    private char[][] board;
    Character character;
    DisplayCharacter displayCharacter;

    public Board(Character character) {
        sideBar = new char[HEIGHT][WIDTH / 4];
        board = new char[HEIGHT][WIDTH - sideBar[0].length];
        this.character = character;
        displayCharacter = new DisplayCharacter();
    }

    private void obstacles() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '#';
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
                        || start[i][coordinate] + direction >= board.length
                        || start[i][coordinate] + direction >= board[0].length) {
                    break;
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
        partOfBoard(3, fields2);

    }

    private void drawSideBar() {
        for (int i = 0; i < sideBar.length; i++) {
            for (int j = 0; j < sideBar[0].length; j++) {
                sideBar[i][j] = '|';
            }
        }
    }

    public void initBoard() {
        drawBoard();
        drawSideBar();
        updateBoard(0);
    }

    public void drawScreen() {
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(Arrays.toString(board[i]));
            System.out.println(Arrays.toString(sideBar[i]));
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
            drawScreen();
        }
    }

}
