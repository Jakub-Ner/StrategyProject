package StrategyProject.characters.types;

import StrategyProject.characters.Character;
import StrategyProject.characters.types.moving.Grub;

public abstract class Grubbing extends Character {
    public Grubbing() {
        super.location = new Grub();
    }
}
