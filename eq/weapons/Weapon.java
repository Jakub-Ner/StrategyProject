package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.eq.Item;

public abstract class Weapon extends Item {
    protected int damage;
    protected PhysicalPower typeOfAttack;

    public Weapon(int damage, boolean specialEffect) {
        this.damage = damage;
        this.specialEffect = specialEffect;
    }

    public abstract String typeOfPower();



}
