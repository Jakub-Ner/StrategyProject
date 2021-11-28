package StrategyProject.moving;

public class Fly extends Go{

    @Override
    public int[][] changeLocation(int goFurther) {
        super.findDestination(goFurther);
        for (int i = 0; i < loation.length; i++) {
            loation[i][super.coordinate] += super.direction;
        }
        return loation;
    }

}
