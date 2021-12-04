package StrategyProject.eq.weaponTypes;

import StrategyProject.characters.Character;
import StrategyProject.eq.Weapon;

public abstract class PhysicalWeapon extends Weapon implements WeaponTypes{
    public PhysicalWeapon(int damage, boolean specialEffect) {
        super(damage, specialEffect);
    }

    @Override
    public int attack(Character enemy) {
        return 0;
    }
}
