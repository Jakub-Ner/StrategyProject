package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.Magic;
import StrategyProject.characters.types.Going;

public class Sorcerer extends Going implements CharacterType {

    public Sorcerer() {
        super.typeOfPower = new Magic();
        super.hp =8;
        super.magicResistance = 18;
        super.armor = 1;
    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
    }
    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer\n");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
