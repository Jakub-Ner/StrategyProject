package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;

public class Stick extends Weapon{
    public Stick() {
        super(2, true);
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
