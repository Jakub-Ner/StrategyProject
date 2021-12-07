package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.Magic;
import StrategyProject.characters.types.Going;

public class Elf extends Going implements CharacterType {

    public Elf() {
        super.typeOfPower = new Magic();
        super.hp =10;
        super.magicResistance = 13;
        super.armor = 3;
    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
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