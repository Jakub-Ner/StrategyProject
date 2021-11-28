package StrategyProject.moving;

public class Fly extends Go{
    @Override
    public void move(char direction) {
        super.move(direction);
        System.out.println("latam");
    }
}
