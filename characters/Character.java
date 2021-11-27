package StrategyProject.characters;

import StrategyProject.moving.Move;

public abstract class Character{
    protected Move location;
    protected CharacterType type;

    public void doMove(int direction){
        location.move(direction);
    }
    public void createCharacter(){
        type.createCharacter();
    }

    public void getLocation() {
        System.out.println(location.x+" "+ location.y);
    }

    public CharacterType getType() {
        return type;
    }

}


