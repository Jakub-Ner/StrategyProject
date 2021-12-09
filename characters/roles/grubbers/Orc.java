package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Grubbing;

public class Orc extends Grubbing implements CharacterType {

    public Orc() {
        super.typeOfPower = new PhysicalPower();
        super.hp = 31;
        super.magicResistance = 2;
        super.armor = 7;
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Orc\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
