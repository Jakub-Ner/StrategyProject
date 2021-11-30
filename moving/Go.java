package StrategyProject.moving;

import java.util.Arrays;

public class Go implements Move {
    protected int coordinate = 0;
    protected int direction = 0;
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

    protected boolean condition(char[][] board, char sign) {
        for (int i = 0; i < location.length; i++) {
            if (location[i][0] >= 0 && location[i][0] < board.length &&
                    location[i][1] >= 0 && location[i][1] < board[0].length) {
                if (board[location[i][0]][location[i][1]] != sign) {
                    return false;
                }
            } else return false;
        }
        return true;
    }

    @Override
    public int[][] moveCharacter(int goFurther, char[][] board) {
        findDestination(goFurther);
        int[][] oldLocation = new int[location.length][];
        for (int i = 0; i < location.length; i++)
            oldLocation[i] = location[i].clone();

        for (int i = 0; i < location.length; i++) {
            location[i][coordinate] += direction;
        }
        int counter = 0;
        for (char sign : signs) {
            if (!condition(board, sign)) {
                counter++;
            }
        }
        if (counter == signs.length) location = oldLocation;
        return location;
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
