package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Grubbing;

public class Dwarf extends Grubbing implements CharacterType {

    public Dwarf() {
        super.typeOfPower = new PhysicalPower();
        super.hp = 34;
        super.magicResistance = 8;
        super.armor = 8;
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Dwarf\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
