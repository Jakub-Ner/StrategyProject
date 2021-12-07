package StrategyProject.characters.types.moving;

public interface Move {
    abstract void findDestination(int direction);
    abstract int[][] getLocation();
    abstract int[][] moveCharacter(int goFurther, char[][] board);
}
