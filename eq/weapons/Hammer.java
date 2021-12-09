package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;

public class Hammer extends Weapon {

    public Hammer() {
        super(15, 0, false);
        super.typeOfAttack = new PhysicalPower();

    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


    @Override
    public int specialEffect() {
        return 1;
    }
}
