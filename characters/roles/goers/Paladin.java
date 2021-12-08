package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPhysicalPower;
import StrategyProject.characters.types.Going;

public class Paladin extends Going implements CharacterType {


    public Paladin() {
        super.typeOfPower = new MagicalPhysicalPower();
        super.hp =30;
        super.magicResistance = 1;
        super.armor = 5;
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Paladin\n");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
