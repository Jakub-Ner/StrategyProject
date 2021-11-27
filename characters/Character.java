package StrategyProject.characters;

import StrategyProject.moving.Move;

public abstract class Character {
    private Move changeLocation;
    private CharacterType type;

    public void doMove(int direction){
        changeLocation.move(direction);
    }


}


