package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Going;

public class Paladin extends Going implements CharacterType {

    public Paladin() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Paladin");
    }
}
