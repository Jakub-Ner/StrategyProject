package StrategyProject.moving;

public class Go implements Move {
    protected int x;
    protected int y;

    public Go() {
        x = Move.x;
        y = Move.y;
    }

    @Override
    public void move(int direction) {
        System.out.println("ide");

    }
}
