package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.characters.types.moving.Go;

public abstract class Going extends Character {
    public Going(){
        super.location = new Go();
    }
}
