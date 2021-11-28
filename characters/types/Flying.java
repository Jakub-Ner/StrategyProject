package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.moving.Fly;

public abstract class Flying extends Character {
    public Flying() {
        super.location = new Fly();
    }
}
