package StrategyProject.moving;

public class Fly extends Go{
    private char[] signs = new char[]{' ', '#'};

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
//    @Override
//    public int[][] moveCharacter(int goFurther, char[][] board) {
//        super.moveCharacter(goFurther, board);
//        return super.location;
//    }

}
