package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Grubbing;

public class Dwarf extends Grubbing implements CharacterType {
    private PhysicalPower typeOfAttack;

    public Dwarf() {
        typeOfAttack = new PhysicalPower();
    }

    @Override
    public String typeOfPower() {
        return typeOfAttack.typeOfPower();
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
