package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Going;

public class Elf extends Going implements CharacterType {

    public Elf() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am an Elf");
    }
}