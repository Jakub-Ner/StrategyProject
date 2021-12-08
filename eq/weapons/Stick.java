package StrategyProject.eq.weapons;

import StrategyProject.characters.roles.PhysicalPower;

public class Stick extends Weapon{
    public Stick() {
        super(27, 0,true);
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
