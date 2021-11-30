package StrategyProject.moving;

public class Grub extends Go {
    private char[] signs = new char[]{' ', '#'};

    @Override
    public int[][] moveCharacter(int goFurther, char[][] board) {
        if (super.specialMovement > 0) {
            specialMovement = 0;
            return location;
        }
        findDestination(goFurther);
        int[][] oldLocation = super.moveCharacterIngredient(goFurther, board);
        if (!super.condition(board, this.signs)) location = oldLocation;
        return location;
    }
//    @Override
//    public int[][] moveCharacter(int goFurther, char[][] board) {
//        super.moveCharacter(goFurther, board);
//        return super.location;
//    }

}
