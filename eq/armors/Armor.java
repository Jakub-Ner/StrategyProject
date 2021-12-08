package StrategyProject.eq.armors;

import StrategyProject.eq.Item;

public abstract class Armor extends Item {
    protected int armor;
    protected int magicResistance;

    public Armor() {
    }

    public int getArmor() {
        return armor;
    }

    public int getMagicResistance() {
        return magicResistance;
    }
}
