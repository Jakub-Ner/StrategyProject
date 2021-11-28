package StrategyProject.characters;

import StrategyProject.moving.Move;

public abstract class Character{
    protected Move location;
    protected CharacterType type;

    public void createCharacter(){
        type.createCharacter();
    }
    public int[][] moveCharacter(int goFurther){
        return location.changeLocation(goFurther);
    }
    public int[][] getLocation(){
        return location.getLocation();
    }

}


