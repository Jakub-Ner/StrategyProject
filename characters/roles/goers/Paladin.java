package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.Magic;
import StrategyProject.characters.roles.MagicalPhysicalPower;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.Going;

public class Paladin extends Going implements CharacterType {


    public Paladin() {
        super.typeOfPower = new MagicalPhysicalPower();
    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Paladin\n");
    }
}
