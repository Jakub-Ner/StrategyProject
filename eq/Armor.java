package StrategyProject.eq;

public abstract class Armor {
    int armor;
    int magicResistance;
    boolean specialEffect;

    public String getArmorName(){return this.getClass().getSimpleName();}

}
