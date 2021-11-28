package StrategyProject.characters;

import StrategyProject.moving.Move;

public abstract class Character{
    protected Move location;
    protected CharacterType type;

    public void doMove(char direction){
        location.findDestination(direction);
    }
    public void createCharacter(){
        type.createCharacter();
    }
    public void moveCharacter(int goFurther){
        location.changeLocation(goFurther);
    }

}


