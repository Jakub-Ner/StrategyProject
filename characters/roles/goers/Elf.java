package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPower;
import StrategyProject.characters.types.Going;

public class Elf extends Going implements CharacterType {

    public Elf() {
        super.typeOfPower = new MagicalPower();
        super.hp =30;
        super.magicResistance = 8;
        super.armor = 3;
    }

    @Override
    public void createCharacter() {

        System.out.println("I am an Elf\n");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}