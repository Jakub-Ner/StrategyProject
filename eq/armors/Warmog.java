package StrategyProject.eq.armors;

public class Warmog extends Armor {
    public Warmog() {
        super.armor = 4;
        super.magicResistance = 0;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
