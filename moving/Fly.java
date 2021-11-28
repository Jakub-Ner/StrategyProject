package StrategyProject.moving;

public class Fly extends Go{
    @Override
    public void findDestination(int direction) {
        super.findDestination(direction);
        System.out.println("latam");
    }
}
