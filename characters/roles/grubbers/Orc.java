package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Grubbing;

public class Orc extends Grubbing implements CharacterType {

    public Orc() {
        super.typeOfPower = new PhysicalPower();

    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Orc\n");
    }
}
