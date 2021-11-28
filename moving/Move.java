package StrategyProject.moving;

public interface Move {
    int x =0;
    int y = 0;
    abstract void move(char direction);
}
