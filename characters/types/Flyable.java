package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.moving.Fly;

public abstract class Flyable extends Character {
    public Flyable() {
        super.location = new Fly();
    }
}
