package StrategyProject.eq.weapons;

import StrategyProject.eq.weaponTypes.PhysicalWeapon;

public class Hammer extends PhysicalWeapon {
    public Hammer() {
        super(5, false);
    }

    @Override
    public String getWeaponName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getWeaponType() {
        return "physical";
    }
}
