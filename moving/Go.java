package StrategyProject.moving;

import StrategyProject.characters.DisplayCharacter;

public class Go implements Move {
    private int coordinate;
    private int direction;
    protected int[][] loation = new int[][]{
            {0, 0}, {0, 1},
            {1, 0}, {1, 1}};

    public Go() {
    }

    @Override
    public int[][] getLocation(){return loation;}

    @Override
    public void changeLocation(int goFurther){
        findDestination(goFurther);

    }
    @Override
    public void findDestination(int goFurther) {
        if (goFurther == 4){
            coordinate = 1;
            direction = -1;
        }
        if (goFurther == 6){
            coordinate = 1;
            direction = 1;
        }
        if (goFurther == 8){
            coordinate = 0;
            direction = -1;
        }
        if (goFurther == 2){
            coordinate = 0;
            direction = 1;
        }
    }

}
