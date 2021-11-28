package StrategyProject.moving;

public interface Move {
    abstract void findDestination(int direction);
    abstract int[][] getLocation();
    abstract int[][] changeLocation(int goFurther);
}
