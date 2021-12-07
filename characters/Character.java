package StrategyProject.characters;

import StrategyProject.characters.roles.TypeOfPower;
import StrategyProject.characters.types.moving.Move;

public abstract class Character{
    protected Move location;
    protected CharacterType type;
    protected TypeOfPower typeOfPower;

//    public abstract String getCharacter

    public abstract String typeOfPower();

    public void createCharacter(){
        type.createCharacter();
    }

    public int[][] moveCharacter(int goFurther, char[][] board){
        return location.moveCharacter(goFurther, board);
    }
    public int[][] getLocation(){
        return location.getLocation();
    }

}


