package StrategyProject.characters.types.moving;

import StrategyProject.Fight;
import StrategyProject.GameOver;

import java.util.Arrays;
import java.util.Random;

public class Go implements Move {
    protected int coordinate = 0;
    protected int direction = 0;
    protected int specialMovement = 0;
    private char[] signs = new char[]{' '};
    protected int[][] location = new int[][]{
            {0, 0}, {0, 1},
            {1, 0}, {1, 1}};

    public Go() {
    }

    @Override
    public int[][] getLocation() {
        return location;
    }

    protected boolean condition(char[][] board, char[] signs) {
        for (int i = 0; i < location.length; i++) {
            if (location[i][0] < 0 || location[i][0] >= board.length ||
                    location[i][1] < 0 || location[i][1] >= board[0].length) {
                return false;
            }
            int counter = 0;
            for (char sign : signs) {
                if (board[location[i][0]][location[i][1]] == sign) {
                    if (sign != ' ') specialMovement++;
                    counter++;
                    break;
                } else if (board[location[i][0]][location[i][1]] >= '0' && board[location[i][0]][location[i][1]] <= '9') {
                    if (Fight.fight((int) (board[location[i][0]][location[i][1]] - '0'))) {
                        GameOver.gameOver();
                    }
                    return false;

                }

            }
            if (counter == 0) return false;
        }
        return true;
    }

    @Override
    public int[][] moveNPC(char[][] board) {
        int x = new Random().nextInt(board[0].length - 5) + 4;
        int y = new Random().nextInt(board.length - 5) + 4;

        for (int i = 0; i < location.length; i++) {
            location[i][0] = y;
            location[i][1] = x;
        }
        location[1][1] += 1;
        location[2][0] += 1;
        location[3][0] += 1;
        location[3][1] += 1;

        return location;
    }

    @Override
    public int[][] moveCharacter(int goFurther, char[][] board) {
        findDestination(goFurther);
        int[][] oldLocation = moveCharacterIngredient();
        if (!condition(board, signs)) location = oldLocation;
        return location;
    }

    protected int[][] moveCharacterIngredient() {
        int[][] oldLocation = new int[location.length][];
        for (int i = 0; i < location.length; i++)
            oldLocation[i] = location[i].clone();

        for (int i = 0; i < location.length; i++) {
            location[i][coordinate] += direction;
        }
        return oldLocation;
    }

    @Override
    public void findDestination(int goFurther) {
        if (goFurther == 4) {
            coordinate = 1;
            direction = -1;
        }
        if (goFurther == 6) {
            coordinate = 1;
            direction = 1;
        }
        if (goFurther == 8) {
            coordinate = 0;
            direction = -1;
        }
        if (goFurther == 2) {
            coordinate = 0;
            direction = 1;
        }
    }

}
