package StrategyProject.eq.armors;


public class Rag extends Armor {
    public Rag() {
        super.armor = 10;
        super.magicResistance = 0;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
