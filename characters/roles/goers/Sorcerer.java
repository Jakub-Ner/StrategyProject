package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.Magic;
import StrategyProject.characters.types.Going;

public class Sorcerer extends Going implements CharacterType {

    public Sorcerer() {
        super.typeOfPower = new Magic();
    }

    @Override
    public String typeOfPower() {
        return super.typeOfPower.typeOfPower();
    }
    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer\n");
    }
}
