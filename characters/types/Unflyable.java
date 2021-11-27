package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.moving.Go;

public abstract class Unflyable extends Character {
    public Unflyable(){
        super.location = new Go();
    }
}
