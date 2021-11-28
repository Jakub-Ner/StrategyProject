package StrategyProject.moving;

public class Go implements Move {
    protected int coordinate = 0;
    protected int direction = 0;
    protected int[][] loation = new int[][]{
            {0, 0}, {0, 1},
            {1, 0}, {1, 1}};

    public Go() {
    }

    @Override
    public int[][] getLocation() {
        return loation;
    }

    @Override
    public int[][] changeLocation(int goFurther) {
        findDestination(goFurther);


        for (int i = 0; i < loation.length; i++) {
            loation[i][coordinate] += direction;
        }
        return loation;
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
