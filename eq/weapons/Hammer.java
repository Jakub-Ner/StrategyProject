package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;

public class Hammer extends Weapon {

    public Hammer() {
        super(85, 0,false);
        super.typeOfAttack = new PhysicalPower();

    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


    @Override
    public int specialEffect() {
        return 0;
    }
}
