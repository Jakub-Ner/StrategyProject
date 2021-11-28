package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.moving.Go;

public abstract class Goiing extends Character {
    public Goiing(){
        super.location = new Go();
    }
}
