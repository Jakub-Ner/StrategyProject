package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;

public class Hammer extends Weapon {

    public Hammer() {
        super(5, false);
        super.typeOfAttack = new PhysicalPower();

    }
    @Override
    public String typeOfPower() {
        return super.typeOfAttack.typeOfPower();
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


}
