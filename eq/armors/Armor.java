package StrategyProject.eq.armors;

import StrategyProject.eq.Item;

public abstract class Armor extends Item {
    int armor;
    int magicResistance;

    public Armor(int armor, int magicResistance) {
        this.armor = armor;
        this.magicResistance = magicResistance;
    }


}
