package StrategyProject.eq.armors;


public class Rag extends Armor {
    public Rag() {
        super(2, 0);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
