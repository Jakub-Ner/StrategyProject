package StrategyProject.eq.armors;

public class ArmorOfWarmog extends Armor{
    public ArmorOfWarmog() {
        super(10, 0);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
