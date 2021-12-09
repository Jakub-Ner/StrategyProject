package StrategyProject.eq.weapons;

import StrategyProject.Game;
import StrategyProject.characters.roles.MagicalPower;

public class ShadowWand extends Weapon {
    private int lastRound;

    public ShadowWand() {
        super(1, 12, true);
        super.typeOfAttack = new MagicalPower();
        this.lastRound = 0;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();

    }

    public int specialEffect() {
        if (Game.round - lastRound > 1) {
            lastRound = Game.round;
            return 2;
        }
        return 1;
    }
}
