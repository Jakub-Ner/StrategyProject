package StrategyProject.eq;

public abstract class Weapon {
    protected int damage;
    protected boolean specialEffect;

    public Weapon(int damage, boolean specialEffect) {
        this.damage = damage;
        this.specialEffect = specialEffect;
    }

    abstract public String getWeaponName();
    abstract public String getWeaponType();



}
