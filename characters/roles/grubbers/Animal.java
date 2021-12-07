package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Grubbing;

public class Animal extends Grubbing implements CharacterType {

    public Animal() {
        super.typeOfPower = new PhysicalPower();
    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
    }

    @Override
    public void createCharacter() {
        System.out.println("I am an Animal\n");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
