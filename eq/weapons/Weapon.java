package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.TypeOfPower;
import StrategyProject.eq.Item;

public abstract class Weapon extends Item {
    protected int physicalDamage;
    protected int magicalDamage;
    protected TypeOfPower typeOfAttack;

    public Weapon(int physicalDamage, int MagicalDamage, boolean specialEffect) {
        this.physicalDamage = physicalDamage;
        this.magicalDamage = MagicalDamage;
        super.specialEffect = specialEffect;
    }
    public abstract int specialEffect();

    public int[] magicalOrPhysical() {
        return typeOfAttack.magicalOrPhysical();
    }
    public String typeOfPower() {
        return typeOfAttack.typeOfPower();
    }

    public int magicalDamage(){return magicalDamage;}
    public int physicalDamage(){return physicalDamage;}
    public boolean getSpecialEffect(){return specialEffect;}


}
